/**
 * 
 */
package q1;

/**
 * @author Deric
 *
 */
public class Name {
    
    
    private String firstName;
    
    private String middleName;
    
    private String lastName;
    
    
    public Name(String first, String middle, String last){
        this.firstName = first;
        this.middleName = middle;
        this.lastName = last;
    }
    
    
    public String firstMiddleLast(){
        return firstName + " " + middleName + " " + lastName;
    }
    
    public String lastFirstMiddle(){
        return lastName + " " + firstName + " " + middleName;
    }
    
    public boolean equals(Name otherName){
        return this.firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast());
    }
    
    public String initials(){
        
        String f = firstName.substring(0, 1).toUpperCase();
        String m = middleName.substring(0, 1).toUpperCase();
        String l = lastName.substring(0, 1).toUpperCase();
        
        return f+m+l;
    }
    
    public int length(){
        return firstName.length() + middleName.length() + lastName.length();
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
