package Jyothi;

		class NationalHighway {
		
			void NH44() {
				System.out.println("National Highway no 44");
			}
		}
		
		class StateHighway  extends NationalHighway{
			void SH56() {
				System.out.println("State Highway no 56");
			}
		}
		
		public class Assignment54 extends StateHighway {
			void CityRange() {
				System.out.println("City Roads");
			}
		
			public static void main(String[] args) {
		
				StateHighway s1=new Assignment54(); // implicit way
				StateHighway s2 =(StateHighway)new Assignment54(); // explicit way
				s2.NH44();
				s2.SH56();
				s1.NH44();
				s1.SH56();
				
			}
		
		}
