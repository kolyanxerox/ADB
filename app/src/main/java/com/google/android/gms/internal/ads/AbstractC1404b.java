package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1404b extends oOOO00o0 {

    /* renamed from: Oooo0, reason: collision with root package name */
    public final oOOO0OOO f17141Oooo0;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final Object f17142Oooo00o;

    public AbstractC1404b(int i, String str, oOOO0OOO oooo0ooo, oOOO0OO0 oooo0oo0) {
        super(i, str, oooo0oo0);
        this.f17142Oooo00o = new Object();
        this.f17141Oooo0 = oooo0ooo;
    }

    @Override // com.google.android.gms.internal.ads.oOOO00o0
    public final OoooOOO.o0O0oo00 OooO00o(oOOO00 oooo00) {
        String str;
        String str2;
        byte[] bArr = oooo00.f22822OooO0O0;
        try {
            Map map = oooo00.f22823OooO0OO;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].trim().split(C3034d9.i.f8173b, 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals(C3037dc.f8237M)) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new OoooOOO.o0O0oo00(str, O0OO00.OooO0O0(oooo00));
    }
}
