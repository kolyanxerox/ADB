package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* renamed from: com.ironsource.mb */
/* loaded from: classes2.dex */
public class C3359mb {

    /* renamed from: d */
    public static final int f9503d = 1;

    /* renamed from: e */
    public static final int f9504e = 2;

    /* renamed from: f */
    public static final String f9505f = "C38FB23A402222A0C17D34A92F971D1F";

    /* renamed from: g */
    public static final String f9506g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* renamed from: h */
    public static final String f9507h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* renamed from: i */
    public static final int f9508i = 32;

    /* renamed from: j */
    private static final C3359mb f9509j = new C3359mb();

    /* renamed from: a */
    private String f9510a = "";

    /* renamed from: b */
    private String f9511b = "";

    /* renamed from: c */
    private String f9512c = "";

    /* renamed from: b */
    public static C3359mb m10015b() {
        return f9509j;
    }

    /* renamed from: a */
    public String m10016a() throws JSONException {
        if (TextUtils.isEmpty(this.f9512c)) {
            try {
                this.f9512c = C3457nk.m10995a(m10018d(), f9506g);
            } catch (Exception e) {
                StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e, "Session key encryption exception: ");
                sbOooOOO0.append(e.getLocalizedMessage());
                String string = sbOooOOO0.toString();
                IronLog.INTERNAL.error(string);
                throw new JSONException(string);
            }
        }
        return this.f9512c;
    }

    /* renamed from: c */
    public String m10017c() {
        if (TextUtils.isEmpty(this.f9510a)) {
            this.f9510a = f9505f;
        }
        return this.f9510a;
    }

    /* renamed from: d */
    public synchronized String m10018d() {
        try {
            if (TextUtils.isEmpty(this.f9511b)) {
                this.f9511b = m10014a(f9507h, 32);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9511b;
    }

    /* renamed from: a */
    private String m10014a(String str, int i) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str.charAt(random.nextInt(str.length())));
        }
        return sb.toString();
    }
}
