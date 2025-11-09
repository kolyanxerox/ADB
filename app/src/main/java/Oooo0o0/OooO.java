package Oooo0o0;

import OooO00o.OooO00o;
import Oooo0OO.o00oO0o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.measurement.oO000;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o0OO00O;
import o000000.OooOo00;
import o000oo0O.o0O0O00;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO;
import o00O0O0O.OooOOO0;
import o00O0O0o.Oooo0;
import o00O0O0o.o000oOoO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00ooo.OooOO0O;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public abstract class OooO implements o0O0O00 {

    /* renamed from: OooOo */
    public static Boolean f13859OooOo;

    /* renamed from: OooOo0o */
    public static Context f13860OooOo0o;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13861OooOo0O;

    public /* synthetic */ OooO(int i) {
        this.f13861OooOo0O = i;
    }

    public static String OooO(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & ForkServer.ERROR;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static Object OooO0O0(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void OooO0OO(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    public static void OooO0Oo(StringBuilder sb, Object obj, Oooo000 oooo000) {
        if (oooo000 != null) {
            sb.append((CharSequence) oooo000.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static OooO00o OooO0o(int i) {
        return i != 0 ? i != 1 ? new OooOo00() : new o000000.OooO0o() : new OooOo00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OooO0OO OooO0oO(OooO0OO oooO0OO, OooO0OO oooO0OO2, o00O0O o00o0o) {
        OooOo.OooO0o0(o00o0o, "<this>");
        if (o00o0o instanceof o00O0OO0.OooO00o) {
            return ((o00O0OO0.OooO00o) o00o0o).create(oooO0OO, oooO0OO2);
        }
        OooOOO0 context = oooO0OO2.getContext();
        return context == OooOOO.f31358OooOo0O ? new o00O0O0o.OooOo(oooO0OO2, oooO0OO, o00o0o) : new o00O0O0o.Oooo000(oooO0OO2, context, o00o0o, oooO0OO);
    }

    public static byte[] OooO0oo(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static OooO0OO OooOOOO(OooO0OO oooO0OO) {
        OooO0OO oooO0OOIntercepted;
        OooOo.OooO0o0(oooO0OO, "<this>");
        o00O0OO0.OooO0OO oooO0OO2 = oooO0OO instanceof o00O0OO0.OooO0OO ? (o00O0OO0.OooO0OO) oooO0OO : null;
        return (oooO0OO2 == null || (oooO0OOIntercepted = oooO0OO2.intercepted()) == null) ? oooO0OO : oooO0OOIntercepted;
    }

    public static boolean OooOOOo(String str) {
        String[] strArr = {Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_AUDIOBOOKS).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PODCASTS).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RECORDINGS).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_SCREENSHOTS).getPath()};
        for (int i = 0; i < 13; i++) {
            if (str.contains(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean OooOOo0(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f13860OooOo0o;
        if (context2 != null && (bool = f13859OooOo) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f13859OooOo = null;
        if (o00oO0o.OooO0oo()) {
            f13859OooOo = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f13859OooOo = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f13859OooOo = Boolean.FALSE;
            }
        }
        f13860OooOo0o = applicationContext;
        return f13859OooOo.booleanValue();
    }

    public static String OooOo(oO000 oo000) {
        StringBuilder sb = new StringBuilder(oo000.OooO0oO());
        for (int i = 0; i < oo000.OooO0oO(); i++) {
            byte bOooO0o0 = oo000.OooO0o0(i);
            if (bOooO0o0 == 34) {
                sb.append("\\\"");
            } else if (bOooO0o0 == 39) {
                sb.append("\\'");
            } else if (bOooO0o0 != 92) {
                switch (bOooO0o0) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bOooO0o0 < 32 || bOooO0o0 > 126) {
                            sb.append('\\');
                            sb.append((char) (((bOooO0o0 >>> 6) & 3) + 48));
                            sb.append((char) (((bOooO0o0 >>> 3) & 7) + 48));
                            sb.append((char) ((bOooO0o0 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bOooO0o0);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void OooOo0(View view, o000000.OooOOO0 oooOOO0) {
        OooOO0O oooOO0O = oooOOO0.f29048OooOo0O.f29029OooO0O0;
        if (oooOO0O == null || !oooOO0O.f32817OooO00o) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ViewCompat.getElevation((View) parent);
        }
        o000000.OooOO0O oooOO0O2 = oooOOO0.f29048OooOo0O;
        if (oooOO0O2.OooOO0o != elevation) {
            oooOO0O2.OooOO0o = elevation;
            oooOOO0.OooOo0();
        }
    }

    public static void OooOo00(ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof o000000.OooOOO0) {
            ((o000000.OooOOO0) background).OooOO0o(f);
        }
    }

    public static void OooOo0O(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof o000000.OooOOO0) {
            OooOo0(viewGroup, (o000000.OooOOO0) background);
        }
    }

    public static Object OooOo0o(o00O0O o00o0o, Object obj, OooO0OO oooO0OO) {
        OooOo.OooO0o0(o00o0o, "<this>");
        OooOOO0 context = oooO0OO.getContext();
        Object oooo0 = context == OooOOO.f31358OooOo0O ? new Oooo0(oooO0OO) : new o000oOoO(oooO0OO, context);
        kotlin.jvm.internal.o0O0O00.OooO0O0(2, o00o0o);
        return o00o0o.invoke(obj, oooo0);
    }

    @Override // o000oo0O.o0O0O00
    public void OooO00o(Serializable serializable) {
        OooOOO0().OooO00o(serializable);
    }

    @Override // o000oo0O.o0O0O00
    public void OooO0o0(String str, HashMap map) {
        OooOOO0().OooO0o0(str, map);
    }

    public abstract Object OooOO0(String str);

    public abstract String OooOO0O();

    public boolean OooOO0o() {
        return Boolean.TRUE.equals(OooOO0("noResult"));
    }

    public abstract boolean OooOOO();

    public abstract o0O0O00 OooOOO0();

    public int hashCode() {
        switch (this.f13861OooOo0O) {
            case 9:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f13861OooOo0O) {
            case 6:
                return OooOO0O() + StringUtils.SPACE + ((String) OooOO0("sql")) + StringUtils.SPACE + ((List) OooOO0("arguments"));
            case 9:
                String strOooO0OO = o0OO00O.OooO00o(getClass()).OooO0OO();
                OooOo.OooO0O0(strOooO0OO);
                return strOooO0OO;
            default:
                return super.toString();
        }
    }

    public void OooOOoo() {
    }

    public void OooOOo(FloatingActionButton floatingActionButton) {
    }
}
