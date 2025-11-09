package o000Ooo;

import OooO0oO.OooOOO0;
import android.content.Context;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import o000O00.o000O000;
import o000O00.o000O00O;
import o000O00.o000O0o;
import o000O00.o000Oo0;

/* loaded from: classes2.dex */
public final class o000000O {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final HashMap f30447OooO0o;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final String f30448OooO0oO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f30449OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0000Ooo f30450OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OoooO0O.o00Ooo f30451OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0 f30452OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOOo.o0ooOOo f30453OooO0o0;

    static {
        HashMap map = new HashMap();
        f30447OooO0o = map;
        OooO00o.OooOo0(5, map, "armeabi", 6, "armeabi-v7a");
        OooO00o.OooOo0(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f30448OooO0oO = "Crashlytics Android SDK/20.0.0";
    }

    public o000000O(Context context, o0000Ooo o0000ooo, OoooO0O.o00Ooo o00ooo2, OooOOO0 oooOOO0, OooOOOo.o0ooOOo o0ooooo) {
        this.f30449OooO00o = context;
        this.f30450OooO0O0 = o0000ooo;
        this.f30451OooO0OO = o00ooo2;
        this.f30452OooO0Oo = oooOOO0;
        this.f30453OooO0o0 = o0ooooo;
    }

    public static o000O0o OooO0OO(C2051sk c2051sk, int i) {
        String str = (String) c2051sk.f24096OooOo;
        int i2 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c2051sk.f24100OooOoO0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C2051sk c2051sk2 = (C2051sk) c2051sk.f24099OooOoO;
        if (i >= 8) {
            for (C2051sk c2051sk3 = c2051sk2; c2051sk3 != null; c2051sk3 = (C2051sk) c2051sk3.f24099OooOoO) {
                i2++;
            }
        }
        int i3 = i2;
        List listOooO0Oo = OooO0Oo(stackTraceElementArr, 4);
        if (listOooO0Oo == null) {
            throw new NullPointerException("Null frames");
        }
        byte b = (byte) (0 | 1);
        o000O0o o000o0oOooO0OO = null;
        if (c2051sk2 != null && i3 == 0) {
            o000o0oOooO0OO = OooO0OO(c2051sk2, i + 1);
        }
        if (b == 1) {
            return new o000O0o(str, (String) c2051sk.f24098OooOo0o, listOooO0Oo, o000o0oOooO0OO, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }

    public static List OooO0Oo(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            o000O00O o000o00o2 = new o000O00O();
            o000o00o2.f29943OooO0o0 = i;
            o000o00o2.f29942OooO0o = (byte) (o000o00o2.f29942OooO0o | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            o000o00o2.f29938OooO00o = jMax;
            byte b = (byte) (o000o00o2.f29942OooO0o | 1);
            o000o00o2.f29942OooO0o = b;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            o000o00o2.f29939OooO0O0 = str;
            o000o00o2.f29940OooO0OO = fileName;
            o000o00o2.f29941OooO0Oo = lineNumber;
            o000o00o2.f29942OooO0o = (byte) (b | 2);
            arrayList.add(o000o00o2.OooO00o());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static o000Oo0 OooO0o0() {
        byte b = (byte) 1;
        if (b == 1) {
            return new o000Oo0(0L, "0", "0");
        }
        StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }

    public final List OooO00o() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        OoooO0O.o00Ooo o00ooo2 = this.f30451OooO0OO;
        String str = (String) o00ooo2.f14029OooO0o0;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        if (b == 3) {
            return Collections.singletonList(new o000O000(str, (String) o00ooo2.f14025OooO0O0, 0L, 0L));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o000O00.o000O OooO0O0(int r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Ooo.o000000O.OooO0O0(int):o000O00.o000O");
    }
}
