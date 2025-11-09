package OoooO0O;

import OooO0oO.OooOo;
import OoooO0.OooOO0O;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.OooOO0;
import com.google.android.gms.internal.measurement.o0OO0O0;
import com.ironsource.C3034d9;
import java.net.ProtocolException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import o0000Ooo.o0O000;
import o0000Ooo.o0oOO;
import o00OO.OooOOOO;
import o00OO0o.OooO;

/* loaded from: classes2.dex */
public final class o0000O00 implements o000oo0.o0OOO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f13927OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f13928OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Object f13929OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public Object f13930OooO0Oo;

    public /* synthetic */ o0000O00(int i, byte b) {
        this.f13927OooO00o = i;
    }

    public static o0000O00 OooO0o(String str) throws ProtocolException, NumberFormatException {
        int i;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        o00OOO0.o00oO0o o00oo0o = o00OOO0.o00oO0o.HTTP_1_0;
        if (zStartsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                o00oo0o = o00OOO0.o00oO0o.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new o0000O00(o00oo0o, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public void OooO(String str, OooOO0 oooOO0) {
        Map map = (Map) this.f13929OooO0OO;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(OooOo.OooOO0O("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, oooOO0);
        if (this.f13928OooO0O0 > 0) {
            new OooOO0O(Looper.getMainLooper(), 0).post(new o00000OO(this, oooOO0, str));
        }
    }

    @Override // o000oo0.o0OOO0o
    public void OooO0O0(o000oo0.o00oO0o o00oo0o) {
        ((Handler) this.f13930OooO0Oo).post(o00oo0o.f31043OooO0O0);
    }

    @Override // o000oo0.o0OOO0o
    public void OooO0OO() {
        HandlerThread handlerThread = (HandlerThread) this.f13929OooO0OO;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f13929OooO0OO = null;
            this.f13930OooO0Oo = null;
        }
    }

    public o0O000 OooO0Oo() {
        o0oOO o0ooo = (o0oOO) this.f13930OooO0Oo;
        if (o0ooo != null) {
            throw o0ooo.OooO00o();
        }
        o0O000 o0o000OooO00o = o0O000.OooO00o(this.f13928OooO0O0, (Object[]) this.f13929OooO0OO, this);
        o0oOO o0ooo2 = (o0oOO) this.f13930OooO0Oo;
        if (o0ooo2 == null) {
            return o0o000OooO00o;
        }
        throw o0ooo2.OooO00o();
    }

    public String OooO0o0() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f13928OooO0O0 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f13929OooO0OO)[i2];
            if (obj instanceof OooO) {
                OooO oooO = (OooO) obj;
                if (!kotlin.jvm.internal.OooOo.OooO00o(oooO.getKind(), o00OO0o.OooOO0O.f32048OooOoO)) {
                    int i3 = ((int[]) this.f13930OooO0Oo)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(oooO.OooO0o0(i3));
                    }
                } else if (((int[]) this.f13930OooO0Oo)[i2] != -1) {
                    sb.append(C3034d9.i.f8177d);
                    sb.append(((int[]) this.f13930OooO0Oo)[i2]);
                    sb.append(C3034d9.i.f8179e);
                }
            } else if (obj != OooOOOO.f31866OooO00o) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(...)");
        return string;
    }

    public void OooO0oO(Object obj, Object obj2) {
        int i = (this.f13928OooO0O0 + 1) * 2;
        Object[] objArr = (Object[]) this.f13929OooO0OO;
        if (i > objArr.length) {
            this.f13929OooO0OO = Arrays.copyOf(objArr, o00O0.o000OOo.OooO0OO(objArr.length, i));
        }
        o0OO0O0.OooO0o0(obj, obj2);
        Object[] objArr2 = (Object[]) this.f13929OooO0OO;
        int i2 = this.f13928OooO0O0;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f13928OooO0O0 = i2 + 1;
    }

    public void OooO0oo(Collection collection) {
        if (collection != null) {
            int size = (collection.size() + this.f13928OooO0O0) * 2;
            Object[] objArr = (Object[]) this.f13929OooO0OO;
            if (size > objArr.length) {
                this.f13929OooO0OO = Arrays.copyOf(objArr, o00O0.o000OOo.OooO0OO(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            OooO0oO(entry.getKey(), entry.getValue());
        }
    }

    public void OooOO0(Bundle bundle) {
        this.f13928OooO0O0 = 1;
        this.f13930OooO0Oo = bundle;
        for (Map.Entry entry : ((Map) this.f13929OooO0OO).entrySet()) {
            ((OooOO0) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void OooOO0O(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f13929OooO0OO).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((OooOO0) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // o000oo0.o0OOO0o
    public void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f13928OooO0O0);
        this.f13929OooO0OO = handlerThread;
        handlerThread.start();
        this.f13930OooO0Oo = new Handler(((HandlerThread) this.f13929OooO0OO).getLooper());
    }

    public String toString() {
        switch (this.f13927OooO00o) {
            case 5:
                return OooO0o0();
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append(((o00OOO0.o00oO0o) this.f13930OooO0Oo) == o00OOO0.o00oO0o.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb.append(' ');
                sb.append(this.f13928OooO0O0);
                String str = (String) this.f13929OooO0OO;
                if (str != null) {
                    sb.append(' ');
                    sb.append(str);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public o0000O00() {
        this.f13927OooO00o = 1;
        this.f13929OooO0OO = Collections.synchronizedMap(new ArrayMap());
        this.f13928OooO0O0 = 0;
    }

    public o0000O00(o00OOO0.o00oO0o o00oo0o, int i, String str) {
        this.f13927OooO00o = 6;
        this.f13930OooO0Oo = o00oo0o;
        this.f13928OooO0O0 = i;
        this.f13929OooO0OO = str;
    }

    public o0000O00(int i, int i2) {
        this.f13927OooO00o = i2;
        switch (i2) {
            case 4:
                this.f13928OooO0O0 = i;
                break;
            default:
                this.f13929OooO0OO = new Object[i * 2];
                this.f13928OooO0O0 = 0;
                break;
        }
    }
}
