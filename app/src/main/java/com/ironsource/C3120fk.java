package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.fk */
/* loaded from: classes2.dex */
public class C3120fk {

    /* renamed from: com.ironsource.fk$a */
    public class a extends GZIPOutputStream {

        /* renamed from: a */
        final /* synthetic */ int f8583a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OutputStream outputStream, int i) throws IOException {
            super(outputStream);
            this.f8583a = i;
            if (i < 0 || i > 9) {
                return;
            }
            ((GZIPOutputStream) this).def.setLevel(i);
        }
    }

    /* renamed from: a */
    public static String m8711a(byte[] bArr) throws JSONException, IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
                sb.append(line);
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception while decompressing " + e);
            return null;
        } catch (OutOfMemoryError e2) {
            C3551q9.m11517d().m11519a(e2);
            String str = "Error while decompressing:" + e2.getMessage();
            IronLog.INTERNAL.error(str);
            m8714b(str);
            return null;
        }
    }

    /* renamed from: b */
    private static void m8714b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.TROUBLESHOOTING_FAILED_TO_GZIP, jSONObject));
    }

    /* renamed from: a */
    public static byte[] m8712a(String str) throws Exception {
        return m8713a(str, -1);
    }

    /* renamed from: a */
    public static byte[] m8713a(String str, int i) throws Exception {
        byte[] byteArray = new byte[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a aVar = new a(byteArrayOutputStream, i);
            aVar.write(str.getBytes());
            aVar.close();
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (OutOfMemoryError e) {
            C3551q9.m11517d().m11519a(e);
            String str2 = "Error while compressing:" + e.getMessage();
            IronLog.INTERNAL.error(str2);
            m8714b(str2);
            return byteArray;
        }
    }
}
