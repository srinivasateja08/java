
public class planbenefit 
{
 
		String name;
		int id;
        int value;
        
        planbenefit(String name,int id,int value)
        {
             this.name=name;
             this.id=id;
             this.value=value;
        }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}


