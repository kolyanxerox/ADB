package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class o0OOo000 {

    /* renamed from: OooO */
    public static final AtomicInteger f26632OooO;

    /* renamed from: OooO0oO */
    public static final Object f26633OooO0oO = new Object();

    /* renamed from: OooO0oo */
    public static volatile o0OOooO0 f26634OooO0oo;

    /* renamed from: OooO00o */
    public final OooO0oO.Oooo000 f26635OooO00o;

    /* renamed from: OooO0O0 */
    public final String f26636OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f26637OooO0OO;

    /* renamed from: OooO0Oo */
    public volatile int f26638OooO0Oo = -1;

    /* renamed from: OooO0o */
    public final /* synthetic */ int f26639OooO0o;

    /* renamed from: OooO0o0 */
    public volatile Object f26640OooO0o0;

    static {
        new AtomicReference();
        f26632OooO = new AtomicInteger();
    }

    public /* synthetic */ o0OOo000(OooO0oO.Oooo000 oooo000, String str, Object obj, int i) {
        this.f26639OooO0o = i;
        if (((Uri) oooo000.f13287OooOo0o) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f26635OooO00o = oooo000;
        this.f26636OooO0O0 = str;
        this.f26637OooO0OO = obj;
    }

    public final Object OooO00o(Object obj) {
        switch (this.f26639OooO0o) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String string = obj.toString();
                    String str = this.f26636OooO0O0;
                    Log.e("PhenotypeFlag", androidx.datastore.preferences.protobuf.OooO00o.OooOOO(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
                    break;
                } else {
                    break;
                }
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!oo0ooO.f26911OooO0O0.matcher(str2).matches()) {
                            if (oo0ooO.f26912OooO0OO.matcher(str2).matches()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    String string2 = obj.toString();
                    String str3 = this.f26636OooO0O0;
                    Log.e("PhenotypeFlag", androidx.datastore.preferences.protobuf.OooO00o.OooOOO(new StringBuilder(str3.length() + 28 + string2.length()), "Invalid boolean value for ", str3, ": ", string2));
                    break;
                } else {
                    break;
                }
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String string3 = obj.toString();
                        String str4 = this.f26636OooO0O0;
                        Log.e("PhenotypeFlag", androidx.datastore.preferences.protobuf.OooO00o.OooOOO(new StringBuilder(str4.length() + 27 + string3.length()), "Invalid double value for ", str4, ": ", string3));
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                if (obj instanceof String) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00cc A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:69:0x000b, B:71:0x000f, B:73:0x0016, B:75:0x0024, B:77:0x0034, B:81:0x0048, B:90:0x0062, B:92:0x006a, B:94:0x0072, B:97:0x0082, B:99:0x0090, B:111:0x00b5, B:114:0x00bd, B:115:0x00c0, B:116:0x00c4, B:103:0x0099, B:105:0x009d, B:107:0x00ab, B:109:0x00b1, B:117:0x00c9, B:118:0x00cb, B:119:0x00cc, B:120:0x00d1, B:78:0x0041, B:121:0x00d2), top: B:127:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0058 A[PHI: r2
  0x0058: PHI (r2v1 o00000o0.o0O0O00) = (r2v0 o00000o0.o0O0O00), (r2v5 o00000o0.o0O0O00), (r2v5 o00000o0.o0O0O00) binds: [B:72:0x0014, B:74:0x0022, B:80:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0062 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:69:0x000b, B:71:0x000f, B:73:0x0016, B:75:0x0024, B:77:0x0034, B:81:0x0048, B:90:0x0062, B:92:0x006a, B:94:0x0072, B:97:0x0082, B:99:0x0090, B:111:0x00b5, B:114:0x00bd, B:115:0x00c0, B:116:0x00c4, B:103:0x0099, B:105:0x009d, B:107:0x00ab, B:109:0x00b1, B:117:0x00c9, B:118:0x00cb, B:119:0x00cc, B:120:0x00d1, B:78:0x0041, B:121:0x00d2), top: B:127:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0O0() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.o0OOo000.OooO0O0():java.lang.Object");
    }
}
