package com.ironsource.sdk.controller;

import com.ironsource.C3336ln;
import com.ironsource.C3551q9;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.ironsource.sdk.controller.s */
/* loaded from: classes2.dex */
final class C3654s {

    /* renamed from: b */
    private static final String f11652b = "MD5";

    /* renamed from: a */
    private String f11653a;

    public C3654s(String str) {
        this.f11653a = str;
    }

    /* renamed from: a */
    public static String m12063a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: b */
    public String m12068b() {
        return this.f11653a;
    }

    /* renamed from: a */
    private String m12064a(String str) {
        try {
            return C3336ln.m9831a(str);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return m12066b(str);
        }
    }

    /* renamed from: b */
    private String m12066b(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(f11652b);
            messageDigest.update(str.getBytes());
            return m12065a(messageDigest.digest());
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* renamed from: a */
    private String m12065a(byte[] bArr) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ForkServer.ERROR);
            if (hexString.length() < 2) {
                hexString = "0".concat(hexString);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public boolean m12067a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(m12064a(str + str2 + this.f11653a));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
