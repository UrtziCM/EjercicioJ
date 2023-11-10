package controllers;


import javax.imageio.ImageIO;

import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MiniController {

    @FXML
    private ImageView BlazingRed;

    @FXML
    private ImageView ElectricBlue;

    @FXML
    private ImageView LapisluxuryBlue;

    @FXML
    private ImageView MidnightBlack;

    @FXML
    private ImageView MoonwalkGrey;

    @FXML
    private ImageView PepperWhite;

    @FXML
    private ImageView ThunderGray;

    @FXML
    private ImageView VolcaninOrange;

    @FXML
    private ImageView lightButton;

    @FXML
    private ImageView lightImageView;
    
    @FXML
    private ImageView mini;
    
    private ImageView[] inputs;

    @FXML
    void windowWasClicked(MouseEvent event) {
    	ImageView clickedImage = whatWasClicked(event);
    	if (clickedImage != null) {
    		if (clickedImage.equals(lightButton)) {
    			lightImageView.setVisible(!lightImageView.isVisible());
    			if (lightImageView.isVisible())
    				lightButton.setImage(new Image(this.getClass().getResource("/img/lucesOn.png").toString()));
    			else
    				lightButton.setImage(new Image(this.getClass().getResource("/img/lucesOff.png").toString()));
    		} else {
    			System.out.println();
    			mini.setImage(new Image(this.getClass().getResource("/img/coches/mini" + clickedImage.getId() + ".png").toString()));  			
    		}
    	}
    }
    @FXML
    public void initialize() {
    	lightImageView.setVisible(false);
    	inputs = new ImageView[]{
    			BlazingRed,
    			ElectricBlue,
    			LapisluxuryBlue,
    			MidnightBlack,
    			MoonwalkGrey,
    			PepperWhite,
    			ThunderGray,
    			VolcaninOrange,
    			lightButton
    	};
    }
    private ImageView whatWasClicked(MouseEvent e) {
    	for (ImageView img : inputs ) {
    		img.setX(img.getX());
    		if (isInBounds(e.getX(), e.getY(), img)) {
    			return img;
    		}
    	}
    	return null;
    }
    
    private static boolean isInBounds(double d, double e,ImageView item) {
    	Point2D actualPos = item.localToScene(item.getLayoutBounds().getMinX(), item.getLayoutBounds().getMinY());
    	if (d < actualPos.getX() || e < actualPos.getY()) {
    		return false;
    	} else if (d > actualPos.getX() + 50 || e > actualPos.getY() + 50) {
    		return false;
    	} 
    	return true;
    }

}

