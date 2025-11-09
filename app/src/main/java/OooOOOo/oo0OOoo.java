package OoooOOO;

import OooO0oO.OooOo;
import Oooo00O.o000000O;
import Oooo00o.o000O0o;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.measurement.Oo0000;
import com.google.android.gms.internal.measurement.OooO0O0;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import o00O0.o000OOo;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public final class oo0OOoo extends oO0Oo0o0 {

    /* renamed from: OooOoO0 */
    public final /* synthetic */ int f14911OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo0OOoo(oOO0000 ooo0000, int i) {
        super(ooo0000);
        this.f14911OooOoO0 = i;
    }

    public static o00OOOOo OooOOOO(OooO0O0 oooO0O0) {
        Object obj;
        Bundle bundleOooOOOo = OooOOOo(oooO0O0.f26418OooO0OO, true);
        String string = (!bundleOooOOOo.containsKey("_o") || (obj = bundleOooOOOo.get("_o")) == null) ? "app" : obj.toString();
        String strOooO0oO = oO0000O.OooO0oO(oooO0O0.f26416OooO00o, oO0000O.f14614OooO00o, oO0000O.f14616OooO0OO);
        if (strOooO0oO == null) {
            strOooO0oO = oooO0O0.f26416OooO00o;
        }
        return new o00OOOOo(strOooO0oO, new o00OOOO0(bundleOooOOOo), string, oooO0O0.f26417OooO0O0);
    }

    public static Bundle OooOOOo(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(OooOOOo((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final Bundle OooOOo(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.o0O00o00 o0o00o00 = (com.google.android.gms.internal.measurement.o0O00o00) it.next();
            String strOooOOo0 = o0o00o00.OooOOo0();
            if (o0o00o00.OooOo()) {
                bundle.putDouble(strOooOOo0, o0o00o00.OooOoO0());
            } else if (o0o00o00.OooOo0O()) {
                bundle.putFloat(strOooOOo0, o0o00o00.OooOo0o());
            } else if (o0o00o00.OooOOo()) {
                bundle.putString(strOooOOo0, o0o00o00.OooOOoo());
            } else if (o0o00o00.OooOo00()) {
                bundle.putLong(strOooOOo0, o0o00o00.OooOo0());
            }
        }
        return bundle;
    }

    public static final void OooOOo0(com.google.android.gms.internal.measurement.o0O00O o0o00o, String str, Long l) {
        List listOooO0oo = o0o00o.OooO0oo();
        int i = 0;
        while (true) {
            if (i >= listOooO0oo.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.o0O00o00) listOooO0oo.get(i)).OooOOo0())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.o0oO0Ooo o0oo0oooOooOoo0 = com.google.android.gms.internal.measurement.o0O00o00.OooOoo0();
        o0oo0oooOooOoo0.OooO0oo(str);
        o0oo0oooOooOoo0.OooOO0(l.longValue());
        if (i < 0) {
            o0o00o.OooOO0o(o0oo0oooOooOoo0);
        } else {
            o0o00o.OooO0O0();
            ((com.google.android.gms.internal.measurement.o0O00OO) o0o00o.f26683OooOo0o).OooOoOO(i, (com.google.android.gms.internal.measurement.o0O00o00) o0oo0oooOooOoo0.OooO0o0());
        }
    }

    public static final com.google.android.gms.internal.measurement.o0O00o00 OooOOoo(com.google.android.gms.internal.measurement.o0O00OO o0o00oo, String str) {
        for (com.google.android.gms.internal.measurement.o0O00o00 o0o00o00 : o0o00oo.OooOOOo()) {
            if (o0o00o00.OooOOo0().equals(str)) {
                return o0o00o00;
            }
        }
        return null;
    }

    public static final void OooOo(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final Serializable OooOo00(com.google.android.gms.internal.measurement.o0O00OO o0o00oo, String str) {
        com.google.android.gms.internal.measurement.o0O00o00 o0o00o00OooOOoo = OooOOoo(o0o00oo, str);
        if (o0o00o00OooOOoo == null) {
            return null;
        }
        return OooOoO(o0o00o00OooOOoo);
    }

    public static final void OooOo0o(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable OooOoO(com.google.android.gms.internal.measurement.o0O00o00 o0o00o00) {
        if (o0o00o00.OooOOo()) {
            return o0o00o00.OooOOoo();
        }
        if (o0o00o00.OooOo00()) {
            return Long.valueOf(o0o00o00.OooOo0());
        }
        if (o0o00o00.OooOo()) {
            return Double.valueOf(o0o00o00.OooOoO0());
        }
        if (o0o00o00.OooOoOO() > 0) {
            return OoooOoO((com.google.android.gms.internal.measurement.oO00O0o0) o0o00o00.OooOoO());
        }
        return null;
    }

    public static final String OooOoO0(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void OooOoOO(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                OooOo(builder, str3, string, set);
            }
        }
    }

    public static final void OooOoo(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        OooOo0o(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void OooOoo0(StringBuilder sb, String str, com.google.android.gms.internal.measurement.o0O0OOO0 o0o0ooo0) {
        if (o0o0ooo0 == null) {
            return;
        }
        OooOo0o(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (o0o0ooo0.OooOOoo() != 0) {
            OooOo0o(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : o0o0ooo0.OooOOo()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (o0o0ooo0.OooOOo0() != 0) {
            OooOo0o(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : o0o0ooo0.OooOOOo()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (o0o0ooo0.OooOo0() != 0) {
            OooOo0o(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (com.google.android.gms.internal.measurement.o0O00O0o o0o00o0o : o0o0ooo0.OooOo00()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(o0o00o0o.OooOOOo() ? Integer.valueOf(o0o00o0o.OooOOo0()) : null);
                sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                sb.append(o0o00o0o.OooOOo() ? Long.valueOf(o0o00o0o.OooOOoo()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (o0o0ooo0.OooOo0o() != 0) {
            OooOo0o(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (com.google.android.gms.internal.measurement.oo0OOoo oo0oooo : o0o0ooo0.OooOo0O()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(oo0oooo.OooOOOo() ? Integer.valueOf(oo0oooo.OooOOo0()) : null);
                sb.append(": [");
                Iterator it = oo0oooo.OooOOo().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append(C3034d9.i.f8179e);
                i7 = i8;
            }
            sb.append("}\n");
        }
        OooOo0o(3, sb);
        sb.append("}\n");
    }

    public static final void OooOooO(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.o00O0OO o00o0oo) {
        if (o00o0oo == null) {
            return;
        }
        OooOo0o(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (o00o0oo.OooOOOo()) {
            int iOooOoO = o00o0oo.OooOoO();
            OooOoo(sb, i, "comparison_type", iOooOoO != 1 ? iOooOoO != 2 ? iOooOoO != 3 ? iOooOoO != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (o00o0oo.OooOOo0()) {
            OooOoo(sb, i, "match_as_float", Boolean.valueOf(o00o0oo.OooOOo()));
        }
        if (o00o0oo.OooOOoo()) {
            OooOoo(sb, i, "comparison_value", o00o0oo.OooOo00());
        }
        if (o00o0oo.OooOo0()) {
            OooOoo(sb, i, "min_comparison_value", o00o0oo.OooOo0O());
        }
        if (o00o0oo.OooOo0o()) {
            OooOoo(sb, i, "max_comparison_value", o00o0oo.OooOo());
        }
        OooOo0o(i, sb);
        sb.append("}\n");
    }

    public static boolean OoooO0(com.google.android.gms.internal.measurement.oO0O0OoO oo0o0ooo, int i) {
        if (i < ((com.google.android.gms.internal.measurement.oO00Oo00) oo0o0ooo).f26703OooOo * 64) {
            return ((1 << (i % 64)) & ((Long) ((com.google.android.gms.internal.measurement.oO00Oo00) oo0o0ooo).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean OoooO00(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static ArrayList OoooO0O(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static com.google.android.gms.internal.measurement.oO000OOo OoooOOo(com.google.android.gms.internal.measurement.oO000OOo oo000ooo, byte[] bArr) throws com.google.android.gms.internal.measurement.oO00O0oO {
        com.google.android.gms.internal.measurement.oO000O0O oo000o0oOooOOO;
        com.google.android.gms.internal.measurement.oO000O0O oo000o0o = com.google.android.gms.internal.measurement.oO000O0O.f26680OooO00o;
        if (oo000o0o == null) {
            synchronized (com.google.android.gms.internal.measurement.oO000O0O.class) {
                try {
                    oo000o0oOooOOO = com.google.android.gms.internal.measurement.oO000O0O.f26680OooO00o;
                    if (oo000o0oOooOOO == null) {
                        com.google.android.gms.internal.measurement.oOo000Oo ooo000oo = com.google.android.gms.internal.measurement.oOo000Oo.f26877OooO0OO;
                        oo000o0oOooOOO = o000OOo.OooOOO();
                        com.google.android.gms.internal.measurement.oO000O0O.f26680OooO00o = oo000o0oOooOOO;
                    }
                } finally {
                }
            }
            oo000o0o = oo000o0oOooOOO;
        }
        if (oo000o0o != null) {
            oo000ooo.getClass();
            oo000ooo.OooO0oO(bArr, bArr.length, oo000o0o);
            return oo000ooo;
        }
        oo000ooo.getClass();
        int length = bArr.length;
        com.google.android.gms.internal.measurement.oO000O0O oo000o0o2 = com.google.android.gms.internal.measurement.oO000O0O.f26680OooO00o;
        com.google.android.gms.internal.measurement.oOo000Oo ooo000oo2 = com.google.android.gms.internal.measurement.oOo000Oo.f26877OooO0OO;
        oo000ooo.OooO0oO(bArr, length, com.google.android.gms.internal.measurement.oO000O0O.f26681OooO0O0);
        return oo000ooo;
    }

    public static int OoooOo0(com.google.android.gms.internal.measurement.o0O0oo0o o0o0oo0o, String str) {
        for (int i = 0; i < ((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o000o00O(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o000o00o(i).OooOOo())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] OoooOoO(com.google.android.gms.internal.measurement.oO00O0o0 oo00o0o0) {
        ArrayList arrayList = new ArrayList();
        Iterator it = oo00o0o0.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.o0O00o00 o0o00o00 = (com.google.android.gms.internal.measurement.o0O00o00) it.next();
            if (o0o00o00 != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.o0O00o00 o0o00o002 : o0o00o00.OooOoO()) {
                    if (o0o00o002.OooOOo()) {
                        bundle.putString(o0o00o002.OooOOo0(), o0o00o002.OooOOoo());
                    } else if (o0o00o002.OooOo00()) {
                        bundle.putLong(o0o00o002.OooOOo0(), o0o00o002.OooOo0());
                    } else if (o0o00o002.OooOo()) {
                        bundle.putDouble(o0o00o002.OooOOo0(), o0o00o002.OooOoO0());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap OoooOoo(boolean z, Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(OoooOoo(false, (Bundle) parcelable));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(OoooOoo(false, (Bundle) obj2));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(OoooOoo(false, (Bundle) obj));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // OoooOOO.oO0Oo0o0
    public final void OooOOO() {
        int i = this.f14911OooOoO0;
    }

    public void OooOo0(StringBuilder sb, int i, com.google.android.gms.internal.measurement.oO00O0o0 oo00o0o0) {
        if (oo00o0o0 == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = oo00o0o0.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.o0O00o00 o0o00o00 = (com.google.android.gms.internal.measurement.o0O00o00) it.next();
            if (o0o00o00 != null) {
                OooOo0o(i2, sb);
                sb.append("param {\n");
                OooOoo(sb, i2, "name", o0o00o00.OooOOOo() ? ((o0OO0oO0) this.f14574OooOo0O).f14524OooOooo.OooO0O0(o0o00o00.OooOOo0()) : null);
                OooOoo(sb, i2, "string_value", o0o00o00.OooOOo() ? o0o00o00.OooOOoo() : null);
                OooOoo(sb, i2, "int_value", o0o00o00.OooOo00() ? Long.valueOf(o0o00o00.OooOo0()) : null);
                OooOoo(sb, i2, "double_value", o0o00o00.OooOo() ? Double.valueOf(o0o00o00.OooOoO0()) : null);
                if (o0o00o00.OooOoOO() > 0) {
                    OooOo0(sb, i2, (com.google.android.gms.internal.measurement.oO00O0o0) o0o00o00.OooOoO());
                }
                OooOo0o(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public void OooOo0O(StringBuilder sb, int i, com.google.android.gms.internal.measurement.o00O0O0O o00o0o0o) {
        String str;
        if (o00o0o0o == null) {
            return;
        }
        OooOo0o(i, sb);
        sb.append("filter {\n");
        if (o00o0o0o.OooOo00()) {
            OooOoo(sb, i, "complement", Boolean.valueOf(o00o0o0o.OooOo0()));
        }
        if (o00o0o0o.OooOo0O()) {
            OooOoo(sb, i, "param_name", ((o0OO0oO0) this.f14574OooOo0O).f14524OooOooo.OooO0O0(o00o0o0o.OooOo0o()));
        }
        if (o00o0o0o.OooOOOo()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.o00O o00oOooOOo0 = o00o0o0o.OooOOo0();
            if (o00oOooOOo0 != null) {
                OooOo0o(i2, sb);
                sb.append("string_filter {\n");
                if (o00oOooOOo0.OooOOOo()) {
                    switch (o00oOooOOo0.OooOo()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    OooOoo(sb, i2, "match_type", str);
                }
                if (o00oOooOOo0.OooOOo0()) {
                    OooOoo(sb, i2, "expression", o00oOooOOo0.OooOOo());
                }
                if (o00oOooOOo0.OooOOoo()) {
                    OooOoo(sb, i2, "case_sensitive", Boolean.valueOf(o00oOooOOo0.OooOo00()));
                }
                if (o00oOooOOo0.OooOo0O() > 0) {
                    OooOo0o(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : o00oOooOOo0.OooOo0()) {
                        OooOo0o(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                OooOo0o(i2, sb);
                sb.append("}\n");
            }
        }
        if (o00o0o0o.OooOOo()) {
            OooOooO(sb, i + 1, "number_filter", o00o0o0o.OooOOoo());
        }
        OooOo0o(i, sb);
        sb.append("}\n");
    }

    public boolean OooOooo() {
        OooOO0o();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((o0OO0oO0) this.f14574OooOo0O).f14516OooOo0O.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public Parcelable Oooo(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (o000O0o unused) {
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0O0("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public void Oooo0(com.google.android.gms.internal.measurement.o0O0o0 o0o0o0, Object obj) {
        o000000O.OooO0oo(obj);
        o0o0o0.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0oOo0O0) o0o0o0.f26683OooOo0o).OooOooo();
        o0o0o0.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0oOo0O0) o0o0o0.f26683OooOo0o).Oooo00O();
        o0o0o0.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0oOo0O0) o0o0o0.f26683OooOo0o).Oooo0();
        if (obj instanceof String) {
            o0o0o0.OooO0O0();
            ((com.google.android.gms.internal.measurement.o0oOo0O0) o0o0o0.f26683OooOo0o).OooOooO((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            o0o0o0.OooO0O0();
            ((com.google.android.gms.internal.measurement.o0oOo0O0) o0o0o0.f26683OooOo0o).Oooo000(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            o0o0o0.OooO0O0();
            ((com.google.android.gms.internal.measurement.o0oOo0O0) o0o0o0.f26683OooOo0o).Oooo00o(dDoubleValue);
        } else {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void Oooo0O0(String str, oO0o0000 oo0o0000, com.google.android.gms.internal.measurement.o0oO0O0o o0oo0o0o, o0O0OOO0 o0o0ooo0) {
        String str2;
        String str3 = oo0o0000.f14770OooO00o;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        OooOO0O();
        OooOO0o();
        try {
            URL url = new URI(str3).toURL();
            this.f14916OooOo0o.Ooooooo();
            byte[] bArrOooO00o = o0oo0o0o.OooO00o();
            o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            Map map = oo0o0000.f14771OooO0O0;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                o0oo0o00.OooOo0o(new o0O0OOOo(this, str2, url, bArrOooO00o, map, o0o0ooo0));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str2), "Failed to parse URL. Not uploading MeasurementBatch. appId", str3);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    public void Oooo0OO(com.google.android.gms.internal.measurement.o0oO0Ooo o0oo0ooo, Object obj) {
        o0oo0ooo.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O00o00) o0oo0ooo.f26683OooOo0o).OooOooo();
        o0oo0ooo.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O00o00) o0oo0ooo.f26683OooOo0o).Oooo00O();
        o0oo0ooo.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O00o00) o0oo0ooo.f26683OooOo0o).Oooo0();
        o0oo0ooo.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O00o00) o0oo0ooo.f26683OooOo0o).Oooo0o0();
        if (obj instanceof String) {
            o0oo0ooo.OooO((String) obj);
            return;
        }
        if (obj instanceof Long) {
            o0oo0ooo.OooOO0(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            o0oo0ooo.OooO0O0();
            ((com.google.android.gms.internal.measurement.o0O00o00) o0oo0ooo.f26683OooOo0o).Oooo00o(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.o0oO0Ooo o0oo0oooOooOoo0 = com.google.android.gms.internal.measurement.o0O00o00.OooOoo0();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.o0oO0Ooo o0oo0oooOooOoo02 = com.google.android.gms.internal.measurement.o0O00o00.OooOoo0();
                    o0oo0oooOooOoo02.OooO0oo(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        o0oo0oooOooOoo02.OooOO0(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        o0oo0oooOooOoo02.OooO((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        o0oo0oooOooOoo02.OooO0O0();
                        ((com.google.android.gms.internal.measurement.o0O00o00) o0oo0oooOooOoo02.f26683OooOo0o).Oooo00o(dDoubleValue2);
                    }
                    o0oo0oooOooOoo0.OooO0O0();
                    ((com.google.android.gms.internal.measurement.o0O00o00) o0oo0oooOooOoo0.f26683OooOo0o).Oooo0O0((com.google.android.gms.internal.measurement.o0O00o00) o0oo0oooOooOoo02.OooO0o0());
                }
                if (((com.google.android.gms.internal.measurement.o0O00o00) o0oo0oooOooOoo0.f26683OooOo0o).OooOoOO() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.o0O00o00) o0oo0oooOooOoo0.OooO0o0());
                }
            }
        }
        o0oo0ooo.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O00o00) o0oo0ooo.f26683OooOo0o).Oooo0OO(arrayList);
    }

    public com.google.android.gms.internal.measurement.o0O00OO Oooo0o(o00OOO0 o00ooo0) {
        com.google.android.gms.internal.measurement.o0O00O o0o00oOooOoO = com.google.android.gms.internal.measurement.o0O00OO.OooOoO();
        o0o00oOooOoO.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O00OO) o0o00oOooOoO.f26683OooOo0o).Oooo00o(o00ooo0.f14168OooO0o0);
        o00OOOO0 o00oooo0 = o00ooo0.f14167OooO0o;
        Objects.requireNonNull(o00oooo0);
        for (String str : o00oooo0.OooOO0o().keySet()) {
            com.google.android.gms.internal.measurement.o0oO0Ooo o0oo0oooOooOoo0 = com.google.android.gms.internal.measurement.o0O00o00.OooOoo0();
            o0oo0oooOooOoo0.OooO0oo(str);
            Object objOooO0o0 = o00oooo0.OooO0o0(str);
            o000000O.OooO0oo(objOooO0o0);
            Oooo0OO(o0oo0oooOooOoo0, objOooO0o0);
            o0o00oOooOoO.OooOO0o(o0oo0oooOooOoo0);
        }
        String str2 = o00ooo0.f14165OooO0OO;
        if (!TextUtils.isEmpty(str2) && o00oooo0.OooO0o0("_o") == null) {
            com.google.android.gms.internal.measurement.o0oO0Ooo o0oo0oooOooOoo02 = com.google.android.gms.internal.measurement.o0O00o00.OooOoo0();
            o0oo0oooOooOoo02.OooO0oo("_o");
            o0oo0oooOooOoo02.OooO(str2);
            o0o00oOooOoO.OooOO0O((com.google.android.gms.internal.measurement.o0O00o00) o0oo0oooOooOoo02.OooO0o0());
        }
        return (com.google.android.gms.internal.measurement.o0O00OO) o0o00oOooOoO.OooO0o0();
    }

    public oOo0o0oO Oooo0o0(String str, com.google.android.gms.internal.measurement.o0O0oo0o o0o0oo0o, com.google.android.gms.internal.measurement.o0O00O o0o00o, String str2) {
        int iIndexOf;
        Oo0000.OooO00o();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (!o0oo0oo0.f14519OooOoO0.OooOo0(str, o0O000O.f14283o0000)) {
            return null;
        }
        o0oo0oo0.f14527Oooo000.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        o0O000 o0o000 = o0O000O.f14330o0ooOO0;
        o00O0OO o00o0oo = o0oo0oo0.f14519OooOoO0;
        String[] strArrSplit = o00o0oo.OooOOo0(str, o0o000).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        oOO0000 ooo0000 = this.f14916OooOo0o;
        oO0oO000 oo0oo000 = ooo0000.f14801OooOooo;
        o0OO00o0 o0oo00o0 = oo0oo000.f14916OooOo0o.f14793OooOo0O;
        oOO0000.OoooOO0(o0oo00o0);
        String strOooOo = o0oo00o0.OooOo(str);
        Uri.Builder builder = new Uri.Builder();
        o0OO0oO0 o0oo0oo02 = (o0OO0oO0) oo0oo000.f14574OooOo0O;
        builder.scheme(o0oo0oo02.f14519OooOoO0.OooOOo0(str, o0O000O.f14319o00Oo0));
        boolean zIsEmpty = TextUtils.isEmpty(strOooOo);
        o00O0OO o00o0oo2 = o0oo0oo02.f14519OooOoO0;
        if (zIsEmpty) {
            builder.authority(o00o0oo2.OooOOo0(str, o0O000O.f14320o00Ooo));
        } else {
            String strOooOOo0 = o00o0oo2.OooOOo0(str, o0O000O.f14320o00Ooo);
            StringBuilder sb = new StringBuilder(String.valueOf(strOooOo).length() + 1 + String.valueOf(strOooOOo0).length());
            sb.append(strOooOo);
            sb.append(".");
            sb.append(strOooOOo0);
            builder.authority(sb.toString());
        }
        builder.path(o00o0oo2.OooOOo0(str, o0O000O.f14321o00o0O));
        OooOo(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).OooOooo(), setUnmodifiableSet);
        o00o0oo.OooOOOo();
        OooOo(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strOooOoO0 = ((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).OooOoO0();
        o0O000 o0o0002 = o0O000O.f14311o0000oO;
        boolean zOooOo0 = o00o0oo.OooOo0(str, o0o0002);
        o0OO00o0 o0oo00o02 = ooo0000.f14793OooOo0O;
        if (zOooOo0) {
            oOO0000.OoooOO0(o0oo00o02);
            if (o0oo00o02.OooOooO(str)) {
                strOooOoO0 = "";
            }
        }
        OooOo(builder, "app_instance_id", strOooOoO0, setUnmodifiableSet);
        OooOo(builder, "rdid", ((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).OooOo0O(), setUnmodifiableSet);
        OooOo(builder, "bundle_id", o0o0oo0o.OooOOOO(), setUnmodifiableSet);
        String strOooOOO = o0o00o.OooOOO();
        String strOooO0oO = oO0000O.OooO0oO(strOooOOO, oO0000O.f14616OooO0OO, oO0000O.f14614OooO00o);
        if (true != TextUtils.isEmpty(strOooO0oO)) {
            strOooOOO = strOooO0oO;
        }
        OooOo(builder, "app_event_name", strOooOOO, setUnmodifiableSet);
        OooOo(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).Oooo0OO()), setUnmodifiableSet);
        String strO000oo0 = ((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o000oo0();
        if (o00o0oo.OooOo0(str, o0o0002)) {
            oOO0000.OoooOO0(o0oo00o02);
            if (o0oo00o02.OooOoo(str) && !TextUtils.isEmpty(strO000oo0) && (iIndexOf = strO000oo0.indexOf(".")) != -1) {
                strO000oo0 = strO000oo0.substring(0, iIndexOf);
            }
        }
        OooOo(builder, "os_version", strO000oo0, setUnmodifiableSet);
        OooOo(builder, "timestamp", String.valueOf(o0o00o.OooOOOO()), setUnmodifiableSet);
        if (((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).OooOo()) {
            OooOo(builder, C3451ne.f10511s, "1", setUnmodifiableSet);
        }
        OooOo(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o00000()), setUnmodifiableSet);
        OooOo(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        OooOo(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        OooOo(builder, "request_uuid", str2, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.o0O00o00> listOooO0oo = o0o00o.OooO0oo();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.o0O00o00 o0o00o00 : listOooO0oo) {
            String strOooOOo02 = o0o00o00.OooOOo0();
            if (o0o00o00.OooOo()) {
                bundle.putString(strOooOOo02, String.valueOf(o0o00o00.OooOoO0()));
            } else if (o0o00o00.OooOo0O()) {
                bundle.putString(strOooOOo02, String.valueOf(o0o00o00.OooOo0o()));
            } else if (o0o00o00.OooOOo()) {
                bundle.putString(strOooOOo02, o0o00o00.OooOOoo());
            } else if (o0o00o00.OooOo00()) {
                bundle.putString(strOooOOo02, String.valueOf(o0o00o00.OooOo0()));
            }
        }
        OooOoOO(builder, o00o0oo.OooOOo0(str, o0O000O.f14322o00oO0O).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.o0oOo0O0> listUnmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o000o00());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.o0oOo0O0 o0ooo0o0 : listUnmodifiableList) {
            String strOooOOo = o0ooo0o0.OooOOo();
            if (o0ooo0o0.OooOoO0()) {
                bundle2.putString(strOooOOo, String.valueOf(o0ooo0o0.OooOoO()));
            } else if (o0ooo0o0.OooOo0o()) {
                bundle2.putString(strOooOOo, String.valueOf(o0ooo0o0.OooOo()));
            } else if (o0ooo0o0.OooOOoo()) {
                bundle2.putString(strOooOOo, o0ooo0o0.OooOo00());
            } else if (o0ooo0o0.OooOo0()) {
                bundle2.putString(strOooOOo, String.valueOf(o0ooo0o0.OooOo0O()));
            }
        }
        OooOoOO(builder, o00o0oo.OooOOo0(str, o0O000O.f14323o00oO0o).split("\\|"), bundle2, setUnmodifiableSet);
        OooOo(builder, "dma", true != ((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o000000() ? "0" : "1", setUnmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o000000o().isEmpty()) {
            OooOo(builder, "dma_cps", ((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o000000o(), setUnmodifiableSet);
        }
        if (((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o00000o0()) {
            com.google.android.gms.internal.measurement.o0O0o o0o0oO0000Ooo = ((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o0000Ooo();
            if (!o0o0oO0000Ooo.OooOoO().isEmpty()) {
                OooOo(builder, "dl_gclid", o0o0oO0000Ooo.OooOoO(), setUnmodifiableSet);
            }
            if (!o0o0oO0000Ooo.OooOoo0().isEmpty()) {
                OooOo(builder, "dl_gbraid", o0o0oO0000Ooo.OooOoo0(), setUnmodifiableSet);
            }
            if (!o0o0oO0000Ooo.OooOooO().isEmpty()) {
                OooOo(builder, "dl_gs", o0o0oO0000Ooo.OooOooO(), setUnmodifiableSet);
            }
            if (o0o0oO0000Ooo.Oooo000() > 0) {
                OooOo(builder, "dl_ss_ts", String.valueOf(o0o0oO0000Ooo.Oooo000()), setUnmodifiableSet);
            }
            if (!o0o0oO0000Ooo.Oooo00o().isEmpty()) {
                OooOo(builder, "mr_gclid", o0o0oO0000Ooo.Oooo00o(), setUnmodifiableSet);
            }
            if (!o0o0oO0000Ooo.Oooo0O0().isEmpty()) {
                OooOo(builder, "mr_gbraid", o0o0oO0000Ooo.Oooo0O0(), setUnmodifiableSet);
            }
            if (!o0o0oO0000Ooo.Oooo0o0().isEmpty()) {
                OooOo(builder, "mr_gs", o0o0oO0000Ooo.Oooo0o0(), setUnmodifiableSet);
            }
            if (o0o0oO0000Ooo.Oooo0oO() > 0) {
                OooOo(builder, "mr_click_ts", String.valueOf(o0o0oO0000Ooo.Oooo0oO()), setUnmodifiableSet);
            }
        }
        return new oOo0o0oO(1, jCurrentTimeMillis, builder.build().toString());
    }

    public String Oooo0oO(com.google.android.gms.internal.measurement.o0oO0O0o o0oo0o0o) {
        com.google.android.gms.internal.measurement.o0O0000O o0o0000oO00000O;
        StringBuilder sbOooOo0O = OooOo.OooOo0O("\nbatch {\n");
        if (o0oo0o0o.OooOo0()) {
            OooOoo(sbOooOo0O, 0, "upload_subdomain", o0oo0o0o.OooOo0O());
        }
        if (o0oo0o0o.OooOOoo()) {
            OooOoo(sbOooOo0O, 0, "sgtm_join_id", o0oo0o0o.OooOo00());
        }
        for (com.google.android.gms.internal.measurement.o0O0O0Oo o0o0o0oo : o0oo0o0o.OooOOOo()) {
            if (o0o0o0oo != null) {
                OooOo0o(1, sbOooOo0O);
                sbOooOo0O.append("bundle {\n");
                if (o0o0o0oo.Oooo()) {
                    OooOoo(sbOooOo0O, 1, "protocol_version", Integer.valueOf(o0o0o0oo.o0000()));
                }
                o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
                if (o0oo0oo0.f14519OooOoO0.OooOo0(o0o0o0oo.OooOOOo(), o0O000O.f14306o0000Ooo) && o0o0o0oo.o0ooOOo()) {
                    OooOoo(sbOooOo0O, 1, "session_stitching_token", o0o0o0oo.o0ooOoO());
                }
                OooOoo(sbOooOo0O, 1, C3451ne.f10417G, o0o0o0oo.o000oo00());
                if (o0o0o0oo.OooOOo()) {
                    OooOoo(sbOooOo0O, 1, "gmp_version", Long.valueOf(o0o0o0oo.OooOOoo()));
                }
                if (o0o0o0oo.OooOo00()) {
                    OooOoo(sbOooOo0O, 1, "uploading_gmp_version", Long.valueOf(o0o0o0oo.OooOo0()));
                }
                if (o0o0o0oo.oo000o()) {
                    OooOoo(sbOooOo0O, 1, "dynamite_version", Long.valueOf(o0o0o0oo.o00oO0o()));
                }
                if (o0o0o0oo.Oooo0o0()) {
                    OooOoo(sbOooOo0O, 1, "config_version", Long.valueOf(o0o0o0oo.Oooo0o()));
                }
                OooOoo(sbOooOo0O, 1, "gmp_app_id", o0o0o0oo.OooOooo());
                OooOoo(sbOooOo0O, 1, "app_id", o0o0o0oo.OooOOOo());
                OooOoo(sbOooOo0O, 1, "app_version", o0o0o0oo.OooOOo0());
                if (o0o0o0oo.Oooo0O0()) {
                    OooOoo(sbOooOo0O, 1, "app_version_major", Integer.valueOf(o0o0o0oo.Oooo0OO()));
                }
                OooOoo(sbOooOo0O, 1, "firebase_instance_id", o0o0o0oo.Oooo0());
                if (o0o0o0oo.OooOoO()) {
                    OooOoo(sbOooOo0O, 1, "dev_cert_hash", Long.valueOf(o0o0o0oo.OooOoOO()));
                }
                OooOoo(sbOooOo0O, 1, "app_store", o0o0o0oo.o000ooO());
                if (o0o0o0oo.oooo00o()) {
                    OooOoo(sbOooOo0O, 1, "upload_timestamp_millis", Long.valueOf(o0o0o0oo.o000o0O0()));
                }
                if (o0o0o0oo.o000o0O()) {
                    OooOoo(sbOooOo0O, 1, "start_timestamp_millis", Long.valueOf(o0o0o0oo.o000o0OO()));
                }
                if (o0o0o0oo.o000o0Oo()) {
                    OooOoo(sbOooOo0O, 1, "end_timestamp_millis", Long.valueOf(o0o0o0oo.o000o0o0()));
                }
                if (o0o0o0oo.o000o0o()) {
                    OooOoo(sbOooOo0O, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(o0o0o0oo.o000o0oO()));
                }
                if (o0o0o0oo.o000o0oo()) {
                    OooOoo(sbOooOo0O, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(o0o0o0oo.o000oOoo()));
                }
                OooOoo(sbOooOo0O, 1, "app_instance_id", o0o0o0oo.OooOoO0());
                OooOoo(sbOooOo0O, 1, "resettable_device_id", o0o0o0oo.OooOo0O());
                OooOoo(sbOooOo0O, 1, "ds_id", o0o0o0oo.Oooo0oo());
                if (o0o0o0oo.OooOo0o()) {
                    OooOoo(sbOooOo0O, 1, "limited_ad_tracking", Boolean.valueOf(o0o0o0oo.OooOo()));
                }
                OooOoo(sbOooOo0O, 1, "os_version", o0o0o0oo.o000oo0());
                OooOoo(sbOooOo0O, 1, "device_model", o0o0o0oo.o000oo0O());
                OooOoo(sbOooOo0O, 1, "user_default_language", o0o0o0oo.o000oo0o());
                if (o0o0o0oo.o000oo()) {
                    OooOoo(sbOooOo0O, 1, "time_zone_offset_minutes", Integer.valueOf(o0o0o0oo.o000ooO0()));
                }
                if (o0o0o0oo.OooOoo0()) {
                    OooOoo(sbOooOo0O, 1, "bundle_sequential_index", Integer.valueOf(o0o0o0oo.OooOoo()));
                }
                if (o0o0o0oo.o00000OO()) {
                    OooOoo(sbOooOo0O, 1, "delivery_index", Integer.valueOf(o0o0o0oo.o00000Oo()));
                }
                if (o0o0o0oo.Oooo000()) {
                    OooOoo(sbOooOo0O, 1, "service_upload", Boolean.valueOf(o0o0o0oo.Oooo00O()));
                }
                OooOoo(sbOooOo0O, 1, "health_monitor", o0o0o0oo.OooOooO());
                if (o0o0o0oo.o00o0O()) {
                    OooOoo(sbOooOo0O, 1, "retry_counter", Integer.valueOf(o0o0o0oo.o00ooo()));
                }
                if (o0o0o0oo.o00oO0O()) {
                    OooOoo(sbOooOo0O, 1, "consent_signals", o0o0o0oo.o0ooOO0());
                }
                if (o0o0o0oo.o000OOo()) {
                    OooOoo(sbOooOo0O, 1, "is_dma_region", Boolean.valueOf(o0o0o0oo.o000000()));
                }
                if (o0o0o0oo.o000000O()) {
                    OooOoo(sbOooOo0O, 1, "core_platform_services", o0o0o0oo.o000000o());
                }
                if (o0o0o0oo.oo0o0Oo()) {
                    OooOoo(sbOooOo0O, 1, "consent_diagnostics", o0o0o0oo.o0O0O00());
                }
                if (o0o0o0oo.o0OOO0o()) {
                    OooOoo(sbOooOo0O, 1, "target_os_version", Long.valueOf(o0o0o0oo.o0Oo0oo()));
                }
                Oo0000.OooO00o();
                if (o0oo0oo0.f14519OooOoO0.OooOo0(o0o0o0oo.OooOOOo(), o0O000O.f14283o0000)) {
                    OooOoo(sbOooOo0O, 1, "ad_services_version", Integer.valueOf(o0o0o0oo.o00000()));
                    if (o0o0o0oo.o00000O0() && (o0o0000oO00000O = o0o0o0oo.o00000O()) != null) {
                        OooOo0o(2, sbOooOo0O);
                        sbOooOo0O.append("attribution_eligibility_status {\n");
                        OooOoo(sbOooOo0O, 2, "eligible", Boolean.valueOf(o0o0000oO00000O.OooOOOo()));
                        OooOoo(sbOooOo0O, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(o0o0000oO00000O.OooOOo0()));
                        OooOoo(sbOooOo0O, 2, "pre_r", Boolean.valueOf(o0o0000oO00000O.OooOOo()));
                        OooOoo(sbOooOo0O, 2, "r_extensions_too_old", Boolean.valueOf(o0o0000oO00000O.OooOOoo()));
                        OooOoo(sbOooOo0O, 2, "adservices_extension_too_old", Boolean.valueOf(o0o0000oO00000O.OooOo00()));
                        OooOoo(sbOooOo0O, 2, "ad_storage_not_allowed", Boolean.valueOf(o0o0000oO00000O.OooOo0()));
                        OooOoo(sbOooOo0O, 2, "measurement_manager_disabled", Boolean.valueOf(o0o0000oO00000O.OooOo0O()));
                        OooOo0o(2, sbOooOo0O);
                        sbOooOo0O.append("}\n");
                    }
                }
                if (o0o0o0oo.o00000o0()) {
                    com.google.android.gms.internal.measurement.o0O0o o0o0oO0000Ooo = o0o0o0oo.o0000Ooo();
                    OooOo0o(2, sbOooOo0O);
                    sbOooOo0O.append("ad_campaign_info {\n");
                    if (o0o0oO0000Ooo.OooOoO0()) {
                        OooOoo(sbOooOo0O, 2, "deep_link_gclid", o0o0oO0000Ooo.OooOoO());
                    }
                    if (o0o0oO0000Ooo.OooOoOO()) {
                        OooOoo(sbOooOo0O, 2, "deep_link_gbraid", o0o0oO0000Ooo.OooOoo0());
                    }
                    if (o0o0oO0000Ooo.OooOoo()) {
                        OooOoo(sbOooOo0O, 2, "deep_link_gad_source", o0o0oO0000Ooo.OooOooO());
                    }
                    if (o0o0oO0000Ooo.OooOooo()) {
                        OooOoo(sbOooOo0O, 2, "deep_link_session_millis", Long.valueOf(o0o0oO0000Ooo.Oooo000()));
                    }
                    if (o0o0oO0000Ooo.Oooo00O()) {
                        OooOoo(sbOooOo0O, 2, "market_referrer_gclid", o0o0oO0000Ooo.Oooo00o());
                    }
                    if (o0o0oO0000Ooo.Oooo0()) {
                        OooOoo(sbOooOo0O, 2, "market_referrer_gbraid", o0o0oO0000Ooo.Oooo0O0());
                    }
                    if (o0o0oO0000Ooo.Oooo0OO()) {
                        OooOoo(sbOooOo0O, 2, "market_referrer_gad_source", o0o0oO0000Ooo.Oooo0o0());
                    }
                    if (o0o0oO0000Ooo.Oooo0o()) {
                        OooOoo(sbOooOo0O, 2, "market_referrer_click_millis", Long.valueOf(o0o0oO0000Ooo.Oooo0oO()));
                    }
                    OooOo0o(2, sbOooOo0O);
                    sbOooOo0O.append("}\n");
                }
                if (o0o0o0oo.OoooO00()) {
                    OooOoo(sbOooOo0O, 1, "batching_timestamp_millis", Long.valueOf(o0o0o0oo.OoooO0()));
                }
                if (o0o0o0oo.o00000oO()) {
                    com.google.android.gms.internal.measurement.o0O0o00O o0o0o00oO00000oo = o0o0o0oo.o00000oo();
                    OooOo0o(2, sbOooOo0O);
                    sbOooOo0O.append("sgtm_diagnostics {\n");
                    int iOooOo00 = o0o0o00oO00000oo.OooOo00();
                    OooOoo(sbOooOo0O, 2, "upload_type", iOooOo00 != 1 ? iOooOo00 != 2 ? iOooOo00 != 3 ? iOooOo00 != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    OooOoo(sbOooOo0O, 2, "client_upload_eligibility", AbstractC2183w4.OooOoo0(o0o0o00oO00000oo.OooOOOo()));
                    int iOooOo0 = o0o0o00oO00000oo.OooOo0();
                    OooOoo(sbOooOo0O, 2, "service_upload_eligibility", iOooOo0 != 1 ? iOooOo0 != 2 ? iOooOo0 != 3 ? iOooOo0 != 4 ? iOooOo0 != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    OooOo0o(2, sbOooOo0O);
                    sbOooOo0O.append("}\n");
                }
                if (o0o0o0oo.OoooO0O()) {
                    com.google.android.gms.internal.measurement.o0O00 o0o00OoooO = o0o0o0oo.OoooO();
                    OooOo0o(2, sbOooOo0O);
                    sbOooOo0O.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.o0O000o0 o0o000o0 : o0o00OoooO.OooOOOo()) {
                        OooOo0o(3, sbOooOo0O);
                        sbOooOo0O.append("limited_data_modes {\n");
                        int iOooOOo0 = o0o000o0.OooOOo0();
                        OooOoo(sbOooOo0O, 3, "type", iOooOOo0 != 1 ? iOooOOo0 != 2 ? iOooOOo0 != 3 ? iOooOOo0 != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iOooOOo = o0o000o0.OooOOo();
                        OooOoo(sbOooOo0O, 3, C3034d9.a.f7933t, iOooOOo != 1 ? iOooOOo != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        OooOo0o(3, sbOooOo0O);
                        sbOooOo0O.append("}\n");
                    }
                    OooOo0o(2, sbOooOo0O);
                    sbOooOo0O.append("}\n");
                }
                com.google.android.gms.internal.measurement.oO00O0o0<com.google.android.gms.internal.measurement.o0oOo0O0> oo00o0o0O000o00 = o0o0o0oo.o000o00();
                o0O00o00 o0o00o00 = o0oo0oo0.f14524OooOooo;
                if (oo00o0o0O000o00 != null) {
                    for (com.google.android.gms.internal.measurement.o0oOo0O0 o0ooo0o0 : oo00o0o0O000o00) {
                        if (o0ooo0o0 != null) {
                            OooOo0o(2, sbOooOo0O);
                            sbOooOo0O.append("user_property {\n");
                            OooOoo(sbOooOo0O, 2, "set_timestamp_millis", o0ooo0o0.OooOOOo() ? Long.valueOf(o0ooo0o0.OooOOo0()) : null);
                            OooOoo(sbOooOo0O, 2, "name", o0o00o00.OooO0OO(o0ooo0o0.OooOOo()));
                            OooOoo(sbOooOo0O, 2, "string_value", o0ooo0o0.OooOo00());
                            OooOoo(sbOooOo0O, 2, "int_value", o0ooo0o0.OooOo0() ? Long.valueOf(o0ooo0o0.OooOo0O()) : null);
                            OooOoo(sbOooOo0O, 2, "double_value", o0ooo0o0.OooOoO0() ? Double.valueOf(o0ooo0o0.OooOoO()) : null);
                            OooOo0o(2, sbOooOo0O);
                            sbOooOo0O.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.oO00O0o0<com.google.android.gms.internal.measurement.o0O000O> oo00o0o0Oooo00o = o0o0o0oo.Oooo00o();
                if (oo00o0o0Oooo00o != null) {
                    for (com.google.android.gms.internal.measurement.o0O000O o0o000o : oo00o0o0Oooo00o) {
                        if (o0o000o != null) {
                            OooOo0o(2, sbOooOo0O);
                            sbOooOo0O.append("audience_membership {\n");
                            if (o0o000o.OooOOOo()) {
                                OooOoo(sbOooOo0O, 2, "audience_id", Integer.valueOf(o0o000o.OooOOo0()));
                            }
                            if (o0o000o.OooOo0()) {
                                OooOoo(sbOooOo0O, 2, "new_audience", Boolean.valueOf(o0o000o.OooOo0O()));
                            }
                            OooOoo0(sbOooOo0O, "current_data", o0o000o.OooOOo());
                            if (o0o000o.OooOOoo()) {
                                OooOoo0(sbOooOo0O, "previous_data", o0o000o.OooOo00());
                            }
                            OooOo0o(2, sbOooOo0O);
                            sbOooOo0O.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.o0O00OO> listO000OoOo = o0o0o0oo.o000OoOo();
                if (listO000OoOo != null) {
                    for (com.google.android.gms.internal.measurement.o0O00OO o0o00oo : listO000OoOo) {
                        if (o0o00oo != null) {
                            OooOo0o(2, sbOooOo0O);
                            sbOooOo0O.append("event {\n");
                            OooOoo(sbOooOo0O, 2, "name", o0o00o00.OooO00o(o0o00oo.OooOOoo()));
                            if (o0o00oo.OooOo00()) {
                                OooOoo(sbOooOo0O, 2, "timestamp_millis", Long.valueOf(o0o00oo.OooOo0()));
                            }
                            if (o0o00oo.OooOo0O()) {
                                OooOoo(sbOooOo0O, 2, "previous_timestamp_millis", Long.valueOf(o0o00oo.OooOo0o()));
                            }
                            if (o0o00oo.OooOo()) {
                                OooOoo(sbOooOo0O, 2, "count", Integer.valueOf(o0o00oo.OooOoO0()));
                            }
                            if (o0o00oo.OooOOo0() != 0) {
                                OooOo0(sbOooOo0O, 2, (com.google.android.gms.internal.measurement.oO00O0o0) o0o00oo.OooOOOo());
                            }
                            OooOo0o(2, sbOooOo0O);
                            sbOooOo0O.append("}\n");
                        }
                    }
                }
                OooOo0o(1, sbOooOo0O);
                sbOooOo0O.append("}\n");
            }
        }
        sbOooOo0O.append("} // End-of-batch\n");
        return sbOooOo0O.toString();
    }

    public String Oooo0oo(com.google.android.gms.internal.measurement.oo0oOO0 oo0ooo0) {
        StringBuilder sbOooOo0O = OooOo.OooOo0O("\nproperty_filter {\n");
        if (oo0ooo0.OooOOOo()) {
            OooOoo(sbOooOo0O, 0, "filter_id", Integer.valueOf(oo0ooo0.OooOOo0()));
        }
        OooOoo(sbOooOo0O, 0, "property_name", ((o0OO0oO0) this.f14574OooOo0O).f14524OooOooo.OooO0OO(oo0ooo0.OooOOo()));
        String strOooOoO0 = OooOoO0(oo0ooo0.OooOo00(), oo0ooo0.OooOo0(), oo0ooo0.OooOo0o());
        if (!strOooOoO0.isEmpty()) {
            OooOoo(sbOooOo0O, 0, "filter_type", strOooOoO0);
        }
        OooOo0O(sbOooOo0O, 1, oo0ooo0.OooOOoo());
        sbOooOo0O.append("}\n");
        return sbOooOo0O.toString();
    }

    public List OoooO(com.google.android.gms.internal.measurement.oO0O0OoO oo0o0ooo, List list) {
        int i;
        ArrayList arrayList = new ArrayList(oo0o0ooo);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
            if (iIntValue < 0) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0OO(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue2 = num.intValue() / 64;
                if (iIntValue2 >= arrayList.size()) {
                    o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14396OooOooO.OooO0Oo(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue2, Long.valueOf(((Long) arrayList.get(iIntValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public boolean OoooOO0(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((o0OO0oO0) this.f14574OooOo0O).f14527Oooo000.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public byte[] OoooOOO(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(e, "Failed to gzip content");
            throw e;
        }
    }

    public long o000oOoO(byte[] bArr) throws NoSuchAlgorithmException {
        o000000O.OooO0oo(bArr);
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        oOO00OO ooo00oo = o0oo0oo0.f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo);
        ooo00oo.OooOO0O();
        MessageDigest messageDigestOooOoo0 = oOO00OO.OooOoo0();
        if (messageDigestOooOoo0 != null) {
            return oOO00OO.OooOoo(messageDigestOooOoo0.digest(bArr));
        }
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14393OooOoOO.OooO0O0("Failed to get MD5");
        return 0L;
    }

    private final void Oooo000() {
    }

    private final void Oooo00O() {
    }

    private final void Oooo00o() {
    }
}
