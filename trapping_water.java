public class trapping_water{
    public static int TrappedWater(int height[]){
        //Left maxi.bound
        int Leftbound[]=new int[height.length];
        Leftbound[0]=height[0];
        for(int i=1;i<height.length;i++){
            Leftbound[i]=Math.max(Leftbound[i-1], height[i]);
        }
        int RightBound[]=new int[height.length];
        RightBound[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            RightBound[i]=Math.max(RightBound[i+1], height[i]);
        }
        int trap_water=0;
        for(int i=0;i<height.length;i++){
            int water_level=Math.min(Leftbound[i], RightBound[i]);
            trap_water+=water_level-height[i];
        }
        return trap_water;
    }   
     public static void main(String args[]) {
        int height[]={3,5,2,6,3,0,6};
        System.out.println(TrappedWater(height));
    }
}