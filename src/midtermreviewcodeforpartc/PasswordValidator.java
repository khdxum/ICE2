/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermreviewcodeforpartc;

/**
 *
 * @author umama
 */
public class PasswordValidator {
    boolean validPassword = false;
    public boolean Validate(String pass){

        int specialCharCount = 0;
        // to see if its special character
        for(int i=0; i<pass.length(); i++){
            if (!(Character.isLetterOrDigit(pass.charAt(i)))){
                //confirm atleast 1 special character
                specialCharCount++;
}

}    
if (specialCharCount>0 && pass.length()>7){
        validPassword = true;
}
    return validPassword;




}
}
