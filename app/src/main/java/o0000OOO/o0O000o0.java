package o0000oOO;

import OoooOOO.oO0000O;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.Arrays;
import o0000Ooo.o00OOOO0;
import o0000Ooo.o00Oo00;
import o0000Ooo.o0O00o0;
import o0000Ooo.o0oOOo;
import o000O00.o00O0O0O;
import o00O0.o000OOo;

/* loaded from: classes2.dex */
public abstract class o0O000o0 {

    /* renamed from: OooO00o */
    public static final o0O00o0 f29646OooO00o;

    /* renamed from: OooO0O0 */
    public static final o0oOOo f29647OooO0O0;

    /* renamed from: OooO0OO */
    public static final o0oOOo f29648OooO0OO;

    /* renamed from: OooO0Oo */
    public static final o0oOOo f29649OooO0Oo;

    /* renamed from: OooO0o */
    public static final o0oOOo f29650OooO0o;

    /* renamed from: OooO0o0 */
    public static final o0oOOo f29651OooO0o0;

    static {
        int i = o0O00o0.f29552OooOo;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f29646OooO00o = o0O00o0.OooOO0o(15, objArr);
        o00OOOO0 o00oooo0 = o00Oo00.f29532OooOo0o;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        o00O0O0O.OooO0O0(7, objArr2);
        f29647OooO0O0 = o00Oo00.OooOO0(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        o00O0O0O.OooO0O0(3, objArr3);
        f29648OooO0OO = o00Oo00.OooOO0(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        o00O0O0O.OooO0O0(2, objArr4);
        f29649OooO0Oo = o00Oo00.OooOO0(2, objArr4);
        o0OO0O0.OooO0o(4, "initialCapacity");
        String[] strArr = oO0000O.f14613OooO;
        o00O0O0O.OooO0O0(15, strArr);
        Object[] objArrCopyOf = Arrays.copyOf(new Object[4], o000OOo.OooO0OO(4, 15));
        System.arraycopy(strArr, 0, objArrCopyOf, 0, 15);
        String[] strArr2 = oO0000O.f14622OooOO0;
        o00O0O0O.OooO0O0(15, strArr2);
        if (objArrCopyOf.length < 30) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, o000OOo.OooO0OO(objArrCopyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, 15, 15);
        f29651OooO0o0 = o00Oo00.OooOO0(30, objArrCopyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        o00O0O0O.OooO0O0(2, objArr5);
        f29650OooO0o = o00Oo00.OooOO0(2, objArr5);
    }

    public static boolean OooO00o(Bundle bundle, String str) {
        if (!f29647OooO0O0.contains(str)) {
            if (bundle == null) {
                return true;
            }
            o0oOOo o0oooo = f29649OooO0Oo;
            int i = o0oooo.f29562OooOoO0;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) o0oooo.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooO0O0(java.lang.String r5, android.os.Bundle r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r7 = r0.equals(r7)
            r0 = 1
            if (r7 != 0) goto La
            return r0
        La:
            o0000Ooo.o0oOOo r7 = o0000oOO.o0O000o0.f29648OooO0OO
            boolean r7 = r7.contains(r5)
            r1 = 0
            if (r7 == 0) goto L14
            goto L69
        L14:
            if (r6 != 0) goto L17
            goto L69
        L17:
            o0000Ooo.o0oOOo r7 = o0000oOO.o0O000o0.f29649OooO0Oo
            int r2 = r7.f29562OooOoO0
            r3 = r1
        L1c:
            if (r3 >= r2) goto L2d
            java.lang.Object r4 = r7.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r6.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L1c
            goto L69
        L2d:
            int r7 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r7 == r2) goto L56
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r7 == r2) goto L4c
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r7 == r2) goto L42
            goto L60
        L42:
            java.lang.String r7 = "fiam"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L60
            r5 = r3
            goto L61
        L4c:
            java.lang.String r7 = "fdl"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L60
            r5 = r0
            goto L61
        L56:
            java.lang.String r7 = "fcm"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L60
            r5 = r1
            goto L61
        L60:
            r5 = -1
        L61:
            java.lang.String r7 = "_cis"
            if (r5 == 0) goto L76
            if (r5 == r0) goto L70
            if (r5 == r3) goto L6a
        L69:
            return r1
        L6a:
            java.lang.String r5 = "fiam_integration"
            r6.putString(r7, r5)
            return r0
        L70:
            java.lang.String r5 = "fdl_integration"
            r6.putString(r7, r5)
            return r0
        L76:
            java.lang.String r5 = "fcm_integration"
            r6.putString(r7, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000oOO.o0O000o0.OooO0O0(java.lang.String, android.os.Bundle, java.lang.String):boolean");
    }
}
