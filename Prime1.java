class Prime1 
{    public static void main(String[] args)
    {
        System.out.println("Print Numbers");
        System.out.println("length" +args.length);
        
        int sum=0;
        for(int i=0;i<args.length;i++){
            int count=0;
            
            int n = Integer.parseInt(args[i]);
            // System.out.println(" "+ n);
            for(int j=2;j<n;j++)
            {
                if(n%j==0)
                {
                    count++;
                }   
            }
            if(count==0)
                {                     
                    System.out.println("Prime" +n);
                }
                else
                {
                    System.out.println("Not Prime" +n);
                }  
                sum+=n;
        }
        System.out.println("Sum"+sum);
    }
}
