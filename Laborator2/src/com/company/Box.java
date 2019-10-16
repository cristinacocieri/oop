package com.company;

public class Box {

       public int height = 1;
       public int width = 1;
       public int depth = 1;

        public Box(){ }

        public Box(int dimension)
        {
            this.height = dimension;
            this.width = dimension;
            this.depth = dimension;
        }
        public Box(int height, int width, int depth)
        {
            this.height = height;
            this.width = width;
            this.depth = depth;
        }

        public static int GetSurfaceAreaofBox(Box obj){
            int surfacearea;

            surfacearea = 2*(obj.height + obj.width + obj.depth);

            return surfacearea;
        }

        public static int GetVolumeofBox(Box obj){
            int volume;

            volume = obj.depth * obj.width * obj.height;

            return volume;
        }
}
