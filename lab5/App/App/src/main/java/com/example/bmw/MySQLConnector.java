package com.example.bmw;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MySQLConnector {
    private Context context;
    private static final String url = "http://127.0.0.1";
    private String response_text;

    public MySQLConnector(Context context) {
        this.context = context;
    }
    public void addUser(User user) {
        RequestQueue queue = Volley.newRequestQueue(this.context);
        StringRequest request = new StringRequest(Request.Method.POST, url + "/add_user.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                response_text = response;
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("ERROR", error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("id", String.valueOf(user.getId()));
                params.put("name", user.getName());
                params.put("email", user.getEmail());
                params.put("password", user.getPassword());
                return params;
            }
        };
        queue.add(request);
    }
    public boolean checkUser(String email) {
        RequestQueue queue = Volley.newRequestQueue(this.context);
        StringRequest request = new StringRequest(Request.Method.POST, url + "/check_user.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                response_text = response;
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("ERROR", error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("name", "");
                params.put("email", email);
                params.put("password", "");
                return params;
            }
        };
        queue.add(request);
        if (response_text.equals("Success")) {
            Log.i("RESPONSE", " return True");
            return true;
        }
        return false;
    }
    public boolean checkUser(String name, String password) {
        RequestQueue queue = Volley.newRequestQueue(this.context);
        StringRequest request = new StringRequest(Request.Method.POST, url + "/check_user.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                response_text = response;
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("ERROR", error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("name", name);
                params.put("email", "");
                params.put("password", password);
                return params;
            }
        };
        queue.add(request);
        if (response_text.equals("Success")) {
            return true;
        }
        return false;
    }
}