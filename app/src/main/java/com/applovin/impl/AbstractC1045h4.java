package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.h4 */
/* loaded from: classes.dex */
public abstract class AbstractC1045h4 {

    /* renamed from: a */
    private static final AtomicReference f847a = new AtomicReference();

    /* renamed from: a */
    public static String m923a() {
        return "iabtechlab-Applovin";
    }

    /* renamed from: b */
    public static URL m925b() {
        try {
            return new URL("https://compliance.iabtechnologylab.com/compliance-js/omid-validation-verification-script-v1-APPLOVIN-01102024.js");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m926c() {
        return "iabtechlab.com-omid";
    }

    /* renamed from: a */
    public static String m924a(C1220k c1220k, Map map) {
        String str = (String) f847a.get();
        if (StringUtils.isValidString(str)) {
            return str;
        }
        URL urlM925b = m925b();
        if (urlM925b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamM3024a = c1220k.m2837H().m3024a(urlM925b.toString(), (List) null, false, map);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamM3024a));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append("\n");
                    } finally {
                    }
                }
                bufferedReader.close();
                if (inputStreamM3024a != null) {
                    inputStreamM3024a.close();
                }
            } finally {
            }
        } catch (Throwable th) {
            c1220k.m2847O().m3213a("OpenMeasurementTestParameters", th);
            c1220k.m2832E().m2148a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th);
        }
        String string = sb.toString();
        f847a.set(string);
        return string;
    }
}
