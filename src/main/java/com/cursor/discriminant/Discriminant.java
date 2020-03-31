package com.cursor.discriminant;

import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.util.logging.Logger;

@Component
public class Discriminant {

    private static final Logger logger = Logger.getLogger(Discriminant.class.getName());

    private double firsArgument;
    private double secondArgument;
    private double thirdArgument;

    public double get() {
        return Math.pow(secondArgument, 2) - 4 * firsArgument * thirdArgument;
    }

    public void checkOut() {
        double discriminant = get();
        String formattedDiscriminant = transformDoubleToStringByDecimalFormat(discriminant);

        if (discriminant > 0) {
            logger.info("\nDiscriminant is " + formattedDiscriminant + " which is Positive\nHence Two Solutions");
        } else if (discriminant == 0) {
            logger.info("\nDiscriminant is " + formattedDiscriminant + " which is Zero\nHence One Solution");
        } else {
            logger.info("\nDiscriminant is " + formattedDiscriminant + " which is Negative\nHence No Real Solutions");
        }
    }

    public String transformDoubleToStringByDecimalFormat(double discriminant) {
        DecimalFormat df = new DecimalFormat("#.##");

        return df.format(discriminant);
    }

    public void setAllArgument(double firsArgument, double secondArgument, double thirdArgument) {
        this.firsArgument = firsArgument;
        this.secondArgument = secondArgument;
        this.thirdArgument = thirdArgument;
    }
}