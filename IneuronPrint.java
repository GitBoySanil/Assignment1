
public class IneuronPrint {

	public static void main(String[] args) {
		int n=8;
	
		///////// PROGRAM TO PRINT INEURON//////////	
		for(int i=0;i<n;i++)
		{
		
			//Pattern to Print I //
			for(int j=0;j<n;j++)
			{
				if(j==(n-1)/2 || i==0 ||i==n-1)
				{
				System.out.print("=");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//Pattern to Print N //
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j ||j==n-1)
				{
				System.out.print("=");
				}
				else
				{
					System.out.print(" ");
				}
			}
		
			
			System.out.print("  ");
			//Pattern to Print E //
			for(int j=0;j<n;j++)
			{
				if(i==0 && j>0  ||i==n-1&&j>0 ||j==0 &&i>0 && i<n-1 ||i==(n-1)/2 && j<n-1)
				{
				System.out.print("=");
				}
				else
				{
					System.out.print(" ");
				}
			}

			System.out.print("  ");
			//Pattern to Print U //
			for(int j=0;j<n;j++)
			{
				if(j==0&&i<n-1 || i==n-1 &&j>0&&j<n-1 || j==n-1 && i<n-1)
				{
				System.out.print("=");
				}
				else
				{
					System.out.print(" ");
				}
			}

			System.out.print("  ");
			//Pattern to Print R //
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<n-1 ||j==n-1 && i>0 && i<(n-1)/2||i==(n-1)/2 && j<n-1  || i==j && i>(n-1)/2 )
				{
				System.out.print("=");
				}
				else
				{
					System.out.print(" ");
				}
			}
			

			System.out.print("  ");
			//Pattern to Print O //
			for(int j=0;j<n;j++)
			{
				if(i==0 && j>0 &&j<n-1||j==0&&i>0&&i<n-1 ||i==n-1&&j>0 &&j<n-1 ||j==n-1&&i>0&&i<n-1)
				{
				System.out.print("=");
				}
				else
				{
					System.out.print(" ");
				}
			}

			System.out.print("  ");
			//Pattern to Print N //
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j ||j==n-1)
				{
				System.out.print("=");
				}
				else
				{
					System.out.print(" ");
				}
			}
		
			

			System.out.println("");
		}
		}}
		
		
		
		

	


