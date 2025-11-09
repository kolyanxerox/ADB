package com.ironsource.mediationsdk.server;

import android.text.TextUtils;
import com.ironsource.C3551q9;
import com.ironsource.InterfaceC3115ff;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Deprecated
/* loaded from: classes2.dex */
public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";

    /* renamed from: a */
    private static final int f10159a = 15000;

    /* renamed from: b */
    private static final String f10160b = "GET";

    /* renamed from: c */
    private static final String f10161c = "POST";

    /* renamed from: d */
    private static final String f10162d = "UTF-8";

    /* renamed from: e */
    private static final String f10163e = "Bad Request - 400";

    /* renamed from: f */
    private static final ExecutorService f10164f = Executors.newSingleThreadExecutor();

    /* renamed from: com.ironsource.mediationsdk.server.HttpFunctions$a */
    public class RunnableC3408a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f10165a;

        /* renamed from: b */
        final /* synthetic */ String f10166b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC3115ff f10167c;

        public RunnableC3408a(String str, String str2, InterfaceC3115ff interfaceC3115ff) {
            this.f10165a = str;
            this.f10166b = str2;
            this.f10167c = interfaceC3115ff;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpURLConnection httpURLConnectionM10683b;
            OutputStream outputStream;
            try {
                httpURLConnectionM10683b = HttpFunctions.m10683b(this.f10165a);
            } catch (Exception e) {
                e = e;
                httpURLConnectionM10683b = null;
                outputStream = null;
            } catch (Throwable th) {
                th = th;
                httpURLConnectionM10683b = null;
                outputStream = null;
            }
            try {
                outputStream = httpURLConnectionM10683b.getOutputStream();
            } catch (Exception e2) {
                e = e2;
                outputStream = null;
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                HttpFunctions.m10684b(outputStream, httpURLConnectionM10683b, null);
                throw th;
            }
            try {
                try {
                    HttpFunctions.m10685b(this.f10166b, outputStream);
                    int responseCode = httpURLConnectionM10683b.getResponseCode();
                    boolean z = responseCode == 200;
                    if (!z) {
                        IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                    }
                    this.f10167c.mo8680a(z);
                } catch (Throwable th3) {
                    th = th3;
                    HttpFunctions.m10684b(outputStream, httpURLConnectionM10683b, null);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                this.f10167c.mo8680a(false);
                HttpFunctions.m10684b(outputStream, httpURLConnectionM10683b, null);
            }
            HttpFunctions.m10684b(outputStream, httpURLConnectionM10683b, null);
        }
    }

    /* renamed from: a */
    private static String m10679a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static HttpURLConnection m10683b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(f10159a);
        httpURLConnection.setConnectTimeout(f10159a);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static String getStringFromURL(String str) throws Exception {
        return getStringFromURL(str, null);
    }

    public static String sendPostRequest(String str, String str2, C3404p.c cVar) {
        Throwable th;
        BufferedReader bufferedReader;
        OutputStream outputStream;
        Exception e;
        HttpURLConnection httpURLConnectionM10683b;
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionM10683b = m10683b(str);
            try {
                httpURLConnectionM10683b.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                outputStream = httpURLConnectionM10683b.getOutputStream();
            } catch (Exception e2) {
                e = e2;
                outputStream = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                outputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnectionM10683b = null;
            outputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            outputStream = null;
            httpURLConnectionM10683b = httpURLConnection;
            m10684b(outputStream, httpURLConnectionM10683b, bufferedReader);
            throw th;
        }
        try {
            m10685b(str2, outputStream);
            int responseCode = httpURLConnectionM10683b.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400 && cVar != null) {
                    cVar.mo10566a(f10163e);
                }
                m10684b(outputStream, httpURLConnectionM10683b, null);
                return null;
            }
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionM10683b.getInputStream()));
            try {
                String strM10679a = m10679a(bufferedReader);
                m10684b(outputStream, httpURLConnectionM10683b, bufferedReader);
                return strM10679a;
            } catch (Exception e4) {
                e = e4;
                try {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                    m10684b(outputStream, httpURLConnectionM10683b, bufferedReader);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    httpURLConnection = httpURLConnectionM10683b;
                    httpURLConnectionM10683b = httpURLConnection;
                    m10684b(outputStream, httpURLConnectionM10683b, bufferedReader);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                m10684b(outputStream, httpURLConnectionM10683b, bufferedReader);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            bufferedReader = null;
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
            m10684b(outputStream, httpURLConnectionM10683b, bufferedReader);
            return null;
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
            httpURLConnection = httpURLConnectionM10683b;
            httpURLConnectionM10683b = httpURLConnection;
            m10684b(outputStream, httpURLConnectionM10683b, bufferedReader);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m10684b(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) throws IOException {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error("exception while closing output stream " + e.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error("exception while closing reader " + e2.getMessage());
            }
        }
    }

    public static String getStringFromURL(String str, C3404p.c cVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e;
        BufferedReader bufferedReader2;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Exception e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            bufferedReader = null;
        }
        try {
            httpURLConnection.setReadTimeout(f10159a);
            httpURLConnection.setConnectTimeout(f10159a);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 400) {
                if (cVar != null) {
                    cVar.mo10566a(f10163e);
                }
                m10684b(null, httpURLConnection, null);
                return null;
            }
            bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            try {
                String strM10679a = m10679a(bufferedReader2);
                m10684b(null, httpURLConnection, bufferedReader2);
                return strM10679a;
            } catch (Exception e3) {
                e = e3;
                try {
                    C3551q9.m11517d().m11519a(e);
                    m10684b(null, httpURLConnection, bufferedReader2);
                    return null;
                } catch (Throwable th3) {
                    bufferedReader = bufferedReader2;
                    th = th3;
                    BufferedReader bufferedReader3 = bufferedReader;
                    th = th;
                    bufferedReader2 = bufferedReader3;
                    m10684b(null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                m10684b(null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            e = e;
            bufferedReader2 = null;
            C3551q9.m11517d().m11519a(e);
            m10684b(null, httpURLConnection, bufferedReader2);
            return null;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            BufferedReader bufferedReader32 = bufferedReader;
            th = th;
            bufferedReader2 = bufferedReader32;
            m10684b(null, httpURLConnection, bufferedReader2);
            throw th;
        }
    }

    public static void sendPostRequest(String str, String str2, InterfaceC3115ff interfaceC3115ff) {
        f10164f.submit(new RunnableC3408a(str, str2, interfaceC3115ff));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m10685b(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, f10162d));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
