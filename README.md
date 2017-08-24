# Swipe_Gestures
Lets you display or start Activity on swipe from particular four directions using Simple Swipe Gestures.

## Note

# On Swipe , the code just replaces the layout activity rather than starting a new actvity.

# SO REPLACE 


<---   
         if (x1 < x2)
                    {
                        Toast.makeText(this, "Left to Right Swap Performed", Toast.LENGTH_LONG).show();
                        setContentView(R.layout.left_right);
                    }
                    
                                --->
   # BY
   
   
   <----    
        if (x1 < x2)
                    {
                        Toast.makeText(this, "Left to Right Swap Performed", Toast.LENGTH_LONG).show();
                         startActivity(new Intent([Your_Current_Activity].this,[Activity_You_Wish_To_Go_To].class));
                         
                    }
                    
                               ---->
                              
 ## Happy Coding
