package java_20190805;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class APIExamCaptchaNkeyResult {
	public static void main(String[] args) {
        String clientId = "kBxW1pAPfM2EdibVjasJ";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "3Eo5Nt8D4D";//애플리케이션 클라이언트 시크릿값";
        try {
            String code = "1"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
            String key = "X7QGriHc4gBONhEl"; // 캡차 키 발급시 받은 키값
            String value = "9fvd43h"; // 사용자가 입력한 캡차 이미지 글자값
            String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code +"&key="+ key + "&value="+ value;

            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            //System.out.println(response.toString());
            
            JSONParser jsonParse = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParse.parse(response.toString());

            String result = String.valueOf((boolean)jsonObj.get("result")); // key갑의 value찾기 ( ~~.get("가져올 값의 key")); 
            response.setLength(0); //StringBuffer에 저장된 문자열 모두 지우기
            response.append(result);
            System.out.println(response.toString());
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
