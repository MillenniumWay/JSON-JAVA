package GroupA.TaskJSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Settings {
    private  static final String TAG_KEY = "Jakarta";
    private static final String TAG_NAME =  "name";
    private static final String TAG_VERSION =  "version";
    private static final String TAG_TECH =  "technology";
   public void writeToJson() throws IOException {

        // Создаю объект для помещения в JSON
         Jakarta jakarta = new Jakarta("JakartaFirst", "1", "SLow");
         Jakarta jakarta1 = new Jakarta("Ann", "2", "Hyper");
         List<Jakarta> arrayList = new ArrayList<>();
         arrayList.add(jakarta);  arrayList.add(jakarta1);

         // Определяю структуру JSON
         String first =   "{  \"Jakarta\": "; String last = "}";

         try   (FileOutputStream fileOutputStream = new FileOutputStream("task.json")) {

           JSONArray jsonArray = new JSONArray();

           for (int i = 0; i < arrayList.size(); i++){
               jsonArray.add(arrayList.get(i));
           }

           fileOutputStream.write(first.getBytes());
           fileOutputStream.write(jsonArray.toJSONString().getBytes());
           fileOutputStream.write(last.getBytes());

             System.out.println("Success > Objects Added to JSON");
             System.out.println("--------------------------");
       } catch (Exception e){
           System.out.println("Write close - Error " + e.toString());
       }

    }
   public Jakarta readFromJson() {

        JSONParser parser  = new JSONParser();
        Jakarta jakarta = new Jakarta();

        try (FileReader reader = new FileReader("task.json")) {

            // Получили объект JSON
            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            // Извлекаем по ключу ("Jakarta") из структуры JSON
            JSONArray jakartaParse = (JSONArray) jsonObject.get(TAG_KEY);

            // Массив для хранения занчений из JSON
            List<Jakarta> jakartaArray = new ArrayList<>();


            for (Object it : jakartaParse) {

                JSONObject arrayObjects = (JSONObject) it;

                // Беру поля из JSON
                String name = (String) arrayObjects.get(TAG_NAME);
                String version = (String) arrayObjects.get(TAG_VERSION);
                String tech = (String) arrayObjects.get(TAG_TECH);

                // Делаю  объекты на основе класса Jakarta,
                // помещаю в него параметры из JSON
                // ввиде зачений для переменных по циклу

               Jakarta jakarta1 = new Jakarta(name, version, tech);
                jakartaArray.add(jakarta1);

            }
            jakarta.setJakarta(jakartaArray);

            System.out.println("readFromJson(): " + jakartaArray.toString());


        } catch (Exception e){
            System.out.println("Parse close - Error " + e.toString());
        }
       return jakarta;

   }


}
