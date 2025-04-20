class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++)
        {
             int arr[] = new int[10];

             for(int j=0;j<9;j++)
             {
                if(board[i][j]!='.')
                {
                    arr[board[i][j]-'0']++;
                }
             }
             for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
                System.out.println(Arrays.toString(arr));
  
        }
        System.out.println("_______________");
        for(int i=0;i<9;i++)
        {
             int arr[] = new int[10];

             for(int j=0;j<9;j++)
             {
               if(board[j][i]!='.')
                {
                    arr[board[j][i]-'0']++;
                }
             }
             for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
             
             // System.out.println(Arrays.toString(arr));
  
        }
        ///////////////////////
        {
        int arr[] = new int[10];
        for(int i=0;i<=2;i++)
        {
             for(int j=0;j<=2;j++)
             {
                if(board[i][j]!='.')
                {
                    arr[board[i][j]-'0']++;
                }
             }
                //System.out.println(Arrays.toString(arr));
  
        }
         for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
        }
//////////////////////////////
         {
        int arr[] = new int[10];
        for(int i=0;i<=2;i++)
        {
             for(int j=3;j<=5;j++)
             {
                if(board[i][j]!='.')
                {
                    arr[board[i][j]-'0']++;
                }
             }
                //System.out.println(Arrays.toString(arr));
  
        }
         for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
        }
//////////////// //////////
         {
        int arr[] = new int[10];
        for(int i=0;i<=2;i++)
        {
             for(int j=6;j<=8;j++)
             {
                if(board[i][j]!='.')
                {
                    arr[board[i][j]-'0']++;
                }
             }
               // System.out.println(Arrays.toString(arr));
  
        }
         for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
        }
        //////////////// //////////
         {
        int arr[] = new int[10];
        for(int i=3;i<=5;i++)
        {
             for(int j=0;j<=2;j++)
             {
                if(board[i][j]!='.')
                {
                    arr[board[i][j]-'0']++;
                }
             }
               // System.out.println(Arrays.toString(arr));
  
        }
         for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
        }
        //////////////// //////////
         {
        int arr[] = new int[10];
        for(int i=3;i<=5;i++)
        {
             for(int j=3;j<=5;j++)
             {
                if(board[i][j]!='.')
                {
                    arr[board[i][j]-'0']++;
                }
             }
               // System.out.println(Arrays.toString(arr));
  
        }
         for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
        }
        //////////////// //////////
         {
        int arr[] = new int[10];
        for(int i=3;i<=5;i++)
        {
             for(int j=6;j<=8;j++)
             {
                if(board[i][j]!='.')
                {
                    arr[board[i][j]-'0']++;
                }
             }
               // System.out.println(Arrays.toString(arr));
  
        }
         for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
        }
        //////////////// //////////
         {
        int arr[] = new int[10];
        for(int i=6;i<=8;i++)
        {
             for(int j=0;j<=2;j++)
             {
                if(board[i][j]!='.')
                {
                    arr[board[i][j]-'0']++;
                }
             }
               // System.out.println(Arrays.toString(arr));
  
        }
         for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
        }
        //////////////// //////////
         {
        int arr[] = new int[10];
        for(int i=6;i<=8;i++)
        {
             for(int j=3;j<=5;j++)
             {
                if(board[i][j]!='.')
                {
                    arr[board[i][j]-'0']++;
                }
             }
               // System.out.println(Arrays.toString(arr));
  
        }
         for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
        }
        //////////////// //////////
         {
        int arr[] = new int[10];
        for(int i=6;i<=8;i++)
        {
             for(int j=6;j<=8;j++)
             {
                if(board[i][j]!='.')
                {
                    arr[board[i][j]-'0']++;
                }
             }
              //  System.out.println(Arrays.toString(arr));
  
        }
         for(int j:arr)
                {
                    if(j>1)
                        return false;
                }
        }
        return true;
    }
}