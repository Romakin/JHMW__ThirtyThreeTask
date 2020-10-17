package org.example.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.example.models.product.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopCatalogReader {

    public List<Product> getList() {
        String content = readStream(
                ShopCatalogReader.class.getClassLoader()
                        .getResourceAsStream("catalog.json")
        );
        return jsonToList(content);
    }

    private List<Product> jsonToList(String json) {
        // Функция реализована согласно заданию
        //  но на больших объемах данных будет значительно проседать по производительсти
        List<Product> result = new ArrayList<>();
        Gson gson = new GsonBuilder().create();
        JSONParser jParser = new JSONParser();
        try {
            JSONArray jsonArray = (JSONArray) jParser.parse(json);
            for (int io = 0; io < jsonArray.size(); io++) {
                result.add(gson.fromJson(((JSONObject) jsonArray.get(io)).toJSONString(), Product.class));
            }
        } catch (Exception e) {}
        return result;
    }

    private String readStream(InputStream ins) {
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(ins)) {
            while (sc.hasNext()) {
                sb.append(sc.nextLine());
            }
        }
        return sb.toString();
    }

    private String readFile(String path) {
        String result = "";
        try(FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) { }
        return result;
    }
}
