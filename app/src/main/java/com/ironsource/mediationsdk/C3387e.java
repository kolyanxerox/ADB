package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C3353m5;
import com.ironsource.C3359mb;
import com.ironsource.C3477o5;
import com.ironsource.C3551q9;
import com.ironsource.C3571qt;
import com.ironsource.C3824x4;
import com.ironsource.InterfaceC3581r4;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.e */
/* loaded from: classes2.dex */
public class C3387e {

    /* renamed from: a */
    private final String f9781a = "1";

    /* renamed from: b */
    private final String f9782b = "102";

    /* renamed from: c */
    private final String f9783c = "102";

    /* renamed from: d */
    private final String f9784d = "GenericNotifications";

    /* renamed from: e */
    private C3388f f9785e;

    /* renamed from: f */
    private IronSource.AD_UNIT f9786f;

    /* renamed from: g */
    private C3477o5 f9787g;

    /* renamed from: h */
    private InterfaceC3581r4 f9788h;

    /* renamed from: i */
    private ISBannerSize f9789i;

    /* renamed from: com.ironsource.mediationsdk.e$a */
    public static class a implements Runnable {

        /* renamed from: a */
        protected InterfaceC3581r4 f9790a;

        /* renamed from: b */
        protected C3368d.a f9791b;

        /* renamed from: c */
        protected int f9792c;

        /* renamed from: d */
        protected String f9793d;

        /* renamed from: e */
        protected long f9794e;

        /* renamed from: f */
        protected int f9795f;

        /* renamed from: h */
        private int f9797h;

        /* renamed from: k */
        private final URL f9800k;

        /* renamed from: l */
        private final JSONObject f9801l;

        /* renamed from: m */
        private final boolean f9802m;

        /* renamed from: n */
        private final int f9803n;

        /* renamed from: o */
        private final long f9804o;

        /* renamed from: p */
        private final boolean f9805p;

        /* renamed from: q */
        private final boolean f9806q;

        /* renamed from: r */
        private final boolean f9807r;

        /* renamed from: i */
        protected String f9798i = "";

        /* renamed from: j */
        protected int f9799j = 0;

        /* renamed from: g */
        protected String f9796g = m10273a((Integer) null);

        public a(InterfaceC3581r4 interfaceC3581r4, URL url, JSONObject jSONObject, boolean z, C3477o5 c3477o5) {
            this.f9790a = interfaceC3581r4;
            this.f9800k = url;
            this.f9801l = jSONObject;
            this.f9802m = z;
            this.f9803n = c3477o5.m11094g();
            this.f9804o = c3477o5.m11100m();
            this.f9805p = c3477o5.m11102o();
            this.f9806q = c3477o5.m11103p();
            this.f9797h = c3477o5.m11091d();
            this.f9807r = c3477o5.m11101n();
        }

        /* renamed from: a */
        private String m10272a() {
            return this.f9797h == 2 ? C3359mb.m10015b().m10018d() : C3359mb.m10015b().m10017c();
        }

        /* renamed from: b */
        private JSONObject m10279b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strDecryptAndDecompress = IronSourceAES.decryptAndDecompress(str, str2);
            if (strDecryptAndDecompress != null) {
                return new JSONObject(strDecryptAndDecompress);
            }
            throw new JSONException("decompression error");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zM10282b = m10282b();
            InterfaceC3581r4 interfaceC3581r4 = this.f9790a;
            if (interfaceC3581r4 == null) {
                return;
            }
            mo9092a(zM10282b, interfaceC3581r4, new Date().getTime() - this.f9794e);
        }

        /* renamed from: a */
        private String m10273a(Integer num) {
            return C3824x4.f12566a.m13012a(this.f9807r, num);
        }

        /* renamed from: b */
        public boolean m10282b() {
            long time;
            int responseCode;
            String str;
            this.f9794e = new Date().getTime();
            try {
                this.f9797h = this.f9799j == 1015 ? 1 : this.f9797h;
                this.f9795f = 0;
                HttpURLConnection httpURLConnectionM10275a = null;
                while (true) {
                    int i = this.f9795f;
                    int i2 = this.f9803n;
                    if (i >= i2) {
                        this.f9795f = i2 - 1;
                        this.f9796g = m10273a(Integer.valueOf(this.f9792c));
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str2 = "Auction Handler: auction trial " + (this.f9795f + 1) + " out of " + this.f9803n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 0);
                        IronSourceUtils.sendAutomationLog(str2);
                        httpURLConnectionM10275a = m10275a(this.f9800k, this.f9804o);
                        m10278a(httpURLConnectionM10275a, this.f9801l, this.f9805p);
                        responseCode = httpURLConnectionM10275a.getResponseCode();
                    } catch (SocketTimeoutException e) {
                        C3551q9.m11517d().m11519a(e);
                        if (httpURLConnectionM10275a != null) {
                            httpURLConnectionM10275a.disconnect();
                        }
                        this.f9792c = 1006;
                        this.f9793d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e.getMessage());
                    } catch (Throwable th) {
                        C3551q9.m11517d().m11519a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnectionM10275a != null) {
                            httpURLConnectionM10275a.disconnect();
                        }
                        this.f9792c = 1000;
                        this.f9793d = th.getMessage();
                        this.f9796g = m10273a(Integer.valueOf(this.f9792c));
                        return false;
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        try {
                            m10281a(m10274a(httpURLConnectionM10275a), this.f9802m, this.f9806q);
                            httpURLConnectionM10275a.disconnect();
                            return true;
                        } catch (JSONException e2) {
                            C3551q9.m11517d().m11519a(e2);
                            if (e2.getMessage() != null && e2.getMessage().equalsIgnoreCase("decryption error")) {
                                this.f9792c = 1003;
                                str = "Auction decryption error";
                            } else if (e2.getMessage() == null || !e2.getMessage().equalsIgnoreCase("decompression error")) {
                                this.f9792c = 1002;
                                str = "Auction parsing error";
                            } else {
                                this.f9792c = 1008;
                                str = "Auction decompression error";
                            }
                            this.f9793d = str;
                            this.f9796g = m10273a(Integer.valueOf(this.f9792c));
                            IronLog.INTERNAL.error("Auction handle response exception " + e2.getMessage());
                            httpURLConnectionM10275a.disconnect();
                            return false;
                        }
                    }
                    this.f9792c = 1001;
                    String str3 = "Auction response code not valid, error code response from server - " + responseCode;
                    this.f9793d = str3;
                    IronLog.INTERNAL.error(str3);
                    httpURLConnectionM10275a.disconnect();
                    if (this.f9795f < this.f9803n - 1) {
                        m10277a(this.f9804o, time);
                    }
                    this.f9795f++;
                }
            } catch (Exception e3) {
                C3551q9.m11517d().m11519a(e3);
                this.f9792c = 1007;
                this.f9793d = e3.getMessage();
                this.f9795f = 0;
                this.f9796g = m10273a(Integer.valueOf(this.f9792c));
                IronLog.INTERNAL.error("Auction request exception " + e3.getMessage());
                return false;
            }
        }

        /* renamed from: a */
        private String m10274a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(line);
            }
        }

        /* renamed from: a */
        private HttpURLConnection m10275a(URL url, long j) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        /* renamed from: a */
        private JSONObject m10276a(String str, String str2) throws JSONException {
            String strDecode = IronSourceAES.decode(str, str2);
            if (TextUtils.isEmpty(strDecode)) {
                throw new JSONException("decryption error");
            }
            return new JSONObject(strDecode);
        }

        /* renamed from: a */
        public JSONObject m10280a(JSONObject jSONObject, boolean z) throws JSONException {
            String strM10272a = m10272a();
            String string = jSONObject.getString(this.f9797h == 2 ? "ct" : C3571qt.f11099n);
            return z ? m10279b(strM10272a, string) : m10276a(strM10272a, string);
        }

        /* renamed from: a */
        private void m10277a(long j, long j2) {
            long time = j - (new Date().getTime() - j2);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        /* renamed from: a */
        public void m10281a(String str, boolean z, boolean z2) throws JSONException {
            if (TextUtils.isEmpty(str)) {
                throw new JSONException("empty response");
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z) {
                jSONObject = m10280a(jSONObject, z2);
            }
            C3368d.a aVarM10128a = C3368d.m10127b().m10128a(jSONObject);
            this.f9791b = aVarM10128a;
            this.f9792c = aVarM10128a.m10148c();
            this.f9793d = this.f9791b.m10149d();
        }

        /* renamed from: a */
        private void m10278a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z) throws Exception {
            String strM10016a;
            String strEncode;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.f9797h == 2) {
                try {
                    strM10016a = C3359mb.m10015b().m10016a();
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    this.f9798i = e.getLocalizedMessage();
                    this.f9799j = 1015;
                    this.f9797h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e.getMessage());
                }
            } else {
                strM10016a = "";
            }
            String string = jSONObject.toString();
            String strM10272a = m10272a();
            if (z) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strEncode = IronSourceAES.compressAndEncrypt(strM10272a, string);
            } else {
                strEncode = IronSourceAES.encode(strM10272a, string);
            }
            bufferedWriter.write(this.f9797h == 2 ? String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", strM10016a, strEncode) : String.format("{\"request\" : \"%1$s\"}", strEncode));
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        /* renamed from: a */
        public void mo9092a(boolean z, InterfaceC3581r4 interfaceC3581r4, long j) {
            if (z) {
                interfaceC3581r4.mo10178a(this.f9791b.m10153h(), this.f9791b.m10146a(), this.f9791b.m10150e(), this.f9791b.m10151f(), this.f9791b.m10147b(), this.f9795f + 1, j, this.f9799j, this.f9798i);
            } else {
                interfaceC3581r4.mo10175a(this.f9792c, this.f9793d, this.f9795f + 1, this.f9796g, j);
            }
        }
    }

    @Deprecated
    public C3387e(IronSource.AD_UNIT ad_unit, C3477o5 c3477o5, InterfaceC3581r4 interfaceC3581r4) {
        this.f9786f = ad_unit;
        this.f9787g = c3477o5;
        this.f9788h = interfaceC3581r4;
    }

    /* renamed from: a */
    private JSONObject m10263a(Map<String, Object> map, List<String> list, C3390h c3390h, int i, boolean z, IronSourceSegment ironSourceSegment) throws JSONException {
        C3391i c3391i = new C3391i(this.f9786f);
        c3391i.m10303a(map);
        c3391i.m10302a(list);
        c3391i.m10298a(c3390h);
        c3391i.m10294a(i);
        c3391i.m10296a(this.f9789i);
        c3391i.m10297a(ironSourceSegment);
        c3391i.m10307b(z);
        return C3368d.m10127b().m10132a(c3391i);
    }

    public C3387e(C3388f c3388f) {
        this.f9785e = c3388f;
    }

    /* renamed from: a */
    public void m10264a(Context context, C3391i c3391i, InterfaceC3581r4 interfaceC3581r4) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f9785e.mo10284a(context, c3391i, interfaceC3581r4));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            if (interfaceC3581r4 != null) {
                interfaceC3581r4.mo10175a(1000, e.getMessage(), 0, C3824x4.f12566a.m13012a(this.f9785e.mo10286b(), 1000), 0L);
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public void m10265a(Context context, Map<String, Object> map, List<String> list, C3390h c3390h, int i, IronSourceSegment ironSourceSegment) {
        C3387e c3387e;
        try {
            boolean zIsEncryptedResponse = IronSourceUtils.isEncryptedResponse();
            c3387e = this;
            try {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(c3387e.f9788h, new URL(c3387e.f9787g.m11087a(false)), c3387e.m10263a(map, list, c3390h, i, zIsEncryptedResponse, ironSourceSegment), zIsEncryptedResponse, c3387e.f9787g));
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                C3551q9.m11517d().m11519a(exc);
                IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
                c3387e.f9788h.mo10175a(1000, exc.getMessage(), 0, C3824x4.f12566a.m13012a(c3387e.f9787g.m11101n(), 1000), 0L);
            }
        } catch (Exception e2) {
            e = e2;
            c3387e = this;
        }
    }

    @Deprecated
    /* renamed from: a */
    public void m10266a(Context context, Map<String, Object> map, List<String> list, C3390h c3390h, int i, IronSourceSegment ironSourceSegment, ISBannerSize iSBannerSize) {
        this.f9789i = iSBannerSize;
        m10265a(context, map, list, c3390h, i, ironSourceSegment);
    }

    /* renamed from: a */
    public void m10267a(C3353m5 c3353m5, int i, C3353m5 c3353m52) throws NumberFormatException {
        Iterator<String> it = c3353m5.m9991h().iterator();
        while (it.hasNext()) {
            C3353m5 c3353m53 = c3353m5;
            int i2 = i;
            C3368d.m10127b().m10133a("reportLoadSuccess", c3353m53.m9986c(), C3368d.m10127b().m10130a(it.next(), i2, c3353m53, "", "", ""));
            i = i2;
            c3353m5 = c3353m53;
        }
        C3353m5 c3353m54 = c3353m5;
        int i3 = i;
        if (c3353m52 != null) {
            Iterator<String> it2 = c3353m52.m9991h().iterator();
            while (it2.hasNext()) {
                C3368d.m10127b().m10133a("reportLoadSuccess", "GenericNotifications", C3368d.m10127b().m10130a(it2.next(), i3, c3353m54, "", "102", ""));
            }
        }
    }

    /* renamed from: a */
    public void m10268a(C3353m5 c3353m5, int i, C3353m5 c3353m52, String str) throws NumberFormatException {
        Iterator<String> it = c3353m5.m9985b().iterator();
        while (it.hasNext()) {
            C3353m5 c3353m53 = c3353m5;
            int i2 = i;
            String str2 = str;
            C3368d.m10127b().m10133a("reportImpression", c3353m53.m9986c(), C3368d.m10127b().m10130a(it.next(), i2, c3353m53, "", "", str2));
            i = i2;
            c3353m5 = c3353m53;
            str = str2;
        }
        C3353m5 c3353m54 = c3353m5;
        int i3 = i;
        String str3 = str;
        if (c3353m52 != null) {
            Iterator<String> it2 = c3353m52.m9985b().iterator();
            while (it2.hasNext()) {
                C3368d.m10127b().m10133a("reportImpression", "GenericNotifications", C3368d.m10127b().m10130a(it2.next(), i3, c3353m54, "", "102", str3));
            }
        }
    }

    /* renamed from: a */
    public void m10269a(ArrayList<String> arrayList, ConcurrentHashMap<String, C3353m5> concurrentHashMap, int i, C3353m5 c3353m5, C3353m5 c3353m52) {
        int iM9993j = c3353m52.m9993j();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList.get(i2);
            i2++;
            String str2 = str;
            if (!str2.equals(c3353m52.m9986c())) {
                C3353m5 c3353m53 = concurrentHashMap.get(str2);
                int iM9993j2 = c3353m53.m9993j();
                String strM9992i = c3353m53.m9992i();
                String str3 = iM9993j2 < iM9993j ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c3353m53.m9986c() + ", instancePriceOrder= " + iM9993j2 + ", loseReasonCode=" + str3 + ", winnerInstance=" + c3353m52.m9986c() + ", winnerInstancePriceOrder=" + iM9993j);
                Iterator<String> it = c3353m53.m9990g().iterator();
                while (it.hasNext()) {
                    C3368d.m10127b().m10133a("reportAuctionLose", c3353m53.m9986c(), C3368d.m10127b().m10130a(it.next(), i, c3353m52, strM9992i, str3, ""));
                }
            }
        }
        if (c3353m5 != null) {
            Iterator<String> it2 = c3353m5.m9990g().iterator();
            while (it2.hasNext()) {
                C3368d.m10127b().m10133a("reportAuctionLose", "GenericNotifications", C3368d.m10127b().m10130a(it2.next(), i, c3353m52, "", "102", ""));
            }
        }
    }

    /* renamed from: a */
    public void m10270a(CopyOnWriteArrayList<AbstractC3415y> copyOnWriteArrayList, ConcurrentHashMap<String, C3353m5> concurrentHashMap, int i, C3353m5 c3353m5, C3353m5 c3353m52) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<AbstractC3415y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo9129c());
        }
        m10269a(arrayList, concurrentHashMap, i, c3353m5, c3353m52);
    }

    /* renamed from: a */
    public boolean m10271a() {
        return this.f9785e.mo10285a();
    }
}
