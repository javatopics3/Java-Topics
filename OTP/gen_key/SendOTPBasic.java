/*
* This code is based on jersey-client library.
* For gradle based project use compile 'com.sun.jersey:jersey-client:1.18.4'
* You can also download the jar and add it to you project.
* */
public class SendOTPBasic {
 //Base URL
 public static String baseUrl = "http://sendotp.msg91.com/api";
 
 // Your application key
 public static String applicationKey = "Your application key here";

 /*
 * Call this function on server side only to check status of number whether it is verified with SendOTP or not.
 * refreshToken : This is a temporary token received from the verify OTP api.
 * */
 public static void checkNumberStatus(String refreshToken,String countryCode,String mobileNumber){
   try {
     Client client = Client.create();
     String Url  = baseUrl+"/checkNumberStatus?refreshToken="+refreshToken+"&countryCode="+countryCode+"&mobileNumber="+mobileNumber;
     WebResource webResource = client.resource(Url);
     ClientResponse response = webResource.type(MediaType.APPLICATION_JSON)
       .header("application-key", applicationKey)
       .get(ClientResponse.class);
     String output = response.getEntity(String.class);
     System.out.println(output);

   } catch (Exception e) {
     e.printStackTrace();
   }
 }
}