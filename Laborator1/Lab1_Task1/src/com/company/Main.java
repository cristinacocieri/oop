package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();
//
        monitor1.color = "Black";
        monitor1.dimensions[0] = 480;
        monitor1.dimensions[1] = 350;
        monitor1.dimensions[2] = 210;
        monitor1.resolution[0] = 1080;
        monitor1.resolution[1] = 720;


        monitor2.color = "Yellow";
        monitor2.dimensions[0] = 350;
        monitor2.dimensions[1] = 240;
        monitor2.dimensions[2] = 150;
        monitor2.resolution[0] = 2040;
        monitor2.resolution[1] = 1080;


        System.out.println("First monitor properties: \nColor: " + monitor1.color + ";\nDimensions: Lenght " + monitor1.dimensions[0] + "mm, Width " + monitor1.dimensions[1] + "mm, Thinkness " + monitor1.dimensions[2] + "mm;\nResolution: " + monitor1.resolution[0] + " * " + monitor1.resolution[1] + " pxl.");

        monitor1.color = "Green";
        monitor1.dimensions[0] = 570;
        monitor1.dimensions[0] = 420;
        monitor1.dimensions[0] = 300;
        monitor1.resolution[0] = 720;
        monitor1.resolution[0] = 480;

        System.out.println("\nUpdate! First monitor properties: \nColor: " + monitor1.color + ";\nDimensions: Lenght " + monitor1.dimensions[0] + "mm, Width " + monitor1.dimensions[1] + "mm, Thinkness " + monitor1.dimensions[2] + "mm;\nResolution: " + monitor1.resolution[0] + " * " + monitor1.resolution[1] + " pxl.");

        System.out.println("\nSecond monitor properties: \nColor: " + monitor2.color + ";\nDimensions: Lenght " + monitor2.dimensions[0] + "mm, Width " + monitor2.dimensions[1] + "mm, Thinkness " + monitor2.dimensions[2] + "mm;\nResolution: " + monitor2.resolution[0] + " * " + monitor2.resolution[1] + " pxl.\n");

        if (monitor1.color == monitor2.color){
            System.out.println("Both monitors have the same color: " + monitor1.color);
        } else if (monitor1.color != monitor2.color){
            System.out.println("Both monitors have different colors.");
        }

        if (monitor1.dimensions[0] == monitor2.dimensions[0] && monitor1.dimensions[1] == monitor2.dimensions[1] && monitor1.dimensions[2] == monitor2.dimensions[2]){
            System.out.println("Both monitors have same dimensions: Lenght " + monitor1.dimensions[0] + "mm, Width " + monitor1.dimensions[1] + "mm, Thinkness " + monitor1.dimensions[2] + "mm");
        } else if (monitor1.dimensions[0] != monitor2.dimensions[1] && monitor1.dimensions[2] != monitor2.dimensions[0] && monitor1.dimensions[1] != monitor2.dimensions[2]){
            System.out.println("Both monitors have different dimensions.");
        }

        if (monitor1.resolution[0] == monitor2.resolution[0] && monitor1.resolution[1] == monitor2.resolution[1]){
            System.out.println("Both monitors have the same resolution: " + monitor2.resolution[0] + " * " + monitor2.resolution[1] + " pxl");
        } else if (monitor1.resolution[0] != monitor2.resolution[0] && monitor1.resolution[1] != monitor2.resolution[1]){
            System.out.println("Both monitors have different resolutions.");
        }


    }
}
