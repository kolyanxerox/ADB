package o00O0oO;

import OooO00o.OooO00o;
import Oooo0o0.OooO;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOo00;
import o00O0.Oooo000;
import o00O0.oo000o;

/* loaded from: classes3.dex */
public abstract class o000000O extends OooO {
    public static String OooOoO(String str) {
        List listOooOO0o;
        OooOo.OooO0o0(str, "<this>");
        if (o000000.OoooOO0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        o0O0O00 o0o0o00 = new o0O0O00(str);
        if (o0o0o00.hasNext()) {
            Object next = o0o0o00.next();
            if (o0o0o00.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (o0o0o00.hasNext()) {
                    arrayList.add(o0o0o00.next());
                }
                listOooOO0o = arrayList;
            } else {
                listOooOO0o = o0OO0O0.OooOO0o(next);
            }
        } else {
            listOooOO0o = oo000o.f31251OooOo0O;
        }
        int length = str.length();
        listOooOO0o.size();
        int iOooOOo0 = o00O0.OooOo.OooOOo0(listOooOO0o);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : listOooOO0o) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                o00O0.OooOo.OooOo00();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iOooOOo0) || !o000000.OoooOO0(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!OooO00o.OooOOo0(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && o0000O00.Oooo0O0(str2, i3, "|", false)) {
                    strSubstring = str2.substring("|".length() + i3);
                    OooOo.OooO0Oo(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        OooOo00.OooOoo(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String OooOoO0(String str) {
        List listOooOO0o;
        Comparable comparable;
        String strSubstring;
        OooOo.OooO0o0(str, "<this>");
        o0O0O00 o0o0o00 = new o0O0O00(str);
        if (o0o0o00.hasNext()) {
            Object next = o0o0o00.next();
            if (o0o0o00.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (o0o0o00.hasNext()) {
                    arrayList.add(o0o0o00.next());
                }
                listOooOO0o = arrayList;
            } else {
                listOooOO0o = o0OO0O0.OooOO0o(next);
            }
        } else {
            listOooOO0o = oo000o.f31251OooOo0O;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listOooOO0o) {
            if (!o000000.OoooOO0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(Oooo000.OooOo0(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!OooO00o.OooOOo0(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList3.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listOooOO0o.size();
        int iOooOOo0 = o00O0.OooOo.OooOOo0(listOooOO0o);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listOooOO0o) {
            int i3 = i + 1;
            if (i < 0) {
                o00O0.OooOo.OooOo00();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == iOooOOo0) && o000000.OoooOO0(str3)) {
                strSubstring = null;
            } else {
                OooOo.OooO0o0(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                OooOo.OooO0Oo(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        OooOo00.OooOoo(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
