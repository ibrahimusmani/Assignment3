/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.jframetest;

/**
 *
 * @author swaha_000
 */
import java.io.*;
import org.json.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeArray.map;
import org.lightcouch.CouchDbClient;
import org.json.JSONException;
import org.json.JSONObject;
public class product {

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQuantity() {
        return pquantity;
    }

    public void setQuantity(int quantity) {
        this.pquantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
    int pid;
    String pname;
    int pquantity;
    int price;
    int sold;
}
