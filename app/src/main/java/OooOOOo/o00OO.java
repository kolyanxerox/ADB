package OoooOOO;

import android.os.Bundle;
import com.ironsource.C3034d9;
import java.util.EnumMap;
import java.util.Objects;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public final class o00OO {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final o00OO f14135OooO0o = new o00OO((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f14136OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f14137OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Boolean f14138OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f14139OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final EnumMap f14140OooO0o0;

    public o00OO(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(oO00000.class);
        this.f14140OooO0o0 = enumMap;
        enumMap.put((EnumMap) oO00000.AD_USER_DATA, (oO00000) (bool == null ? ooo0Oo0.UNINITIALIZED : bool.booleanValue() ? ooo0Oo0.GRANTED : ooo0Oo0.DENIED));
        this.f14136OooO00o = i;
        this.f14137OooO0O0 = OooO0Oo();
        this.f14138OooO0OO = bool2;
        this.f14139OooO0Oo = str;
    }

    public static o00OO OooO0O0(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f14135OooO0o;
        }
        String[] strArrSplit = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(oO00000.class);
        oO00000[] oo00000Arr = EnumC0000o.DMA.f14082OooOo0O;
        int length = oo00000Arr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put((EnumMap) oo00000Arr[i3], (oO00000) oO00000o.OooO0o0(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new o00OO(enumMap, i, (Boolean) null, (String) null);
    }

    public static o00OO OooO0OO(int i, Bundle bundle) {
        if (bundle == null) {
            return new o00OO((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(oO00000.class);
        for (oO00000 oo00000 : EnumC0000o.DMA.f14082OooOo0O) {
            enumMap.put((EnumMap) oo00000, (oO00000) oO00000o.OooO0Oo(bundle.getString(oo00000.f14609OooOo0O)));
        }
        return new o00OO(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final ooo0Oo0 OooO00o() {
        ooo0Oo0 ooo0oo0 = (ooo0Oo0) this.f14140OooO0o0.get(oO00000.AD_USER_DATA);
        return ooo0oo0 == null ? ooo0Oo0.UNINITIALIZED : ooo0oo0;
    }

    public final String OooO0Oo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14136OooO00o);
        for (oO00000 oo00000 : EnumC0000o.DMA.f14082OooOo0O) {
            sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb.append(oO00000o.OooO0oo((ooo0Oo0) this.f14140OooO0o0.get(oo00000)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00OO)) {
            return false;
        }
        o00OO o00oo = (o00OO) obj;
        if (this.f14137OooO0O0.equalsIgnoreCase(o00oo.f14137OooO0O0) && Objects.equals(this.f14138OooO0OO, o00oo.f14138OooO0OO)) {
            return Objects.equals(this.f14139OooO0Oo, o00oo.f14139OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f14138OooO0OO;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f14139OooO0Oo;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f14137OooO0O0.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(oO00000o.OooO00o(this.f14136OooO00o));
        for (oO00000 oo00000 : EnumC0000o.DMA.f14082OooOo0O) {
            sb.append(",");
            sb.append(oo00000.f14609OooOo0O);
            sb.append(C3034d9.i.f8173b);
            ooo0Oo0 ooo0oo0 = (ooo0Oo0) this.f14140OooO0o0.get(oo00000);
            if (ooo0oo0 == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = ooo0oo0.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f14138OooO0OO;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f14139OooO0Oo;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public o00OO(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(oO00000.class);
        this.f14140OooO0o0 = enumMap2;
        enumMap2.putAll(enumMap);
        this.f14136OooO00o = i;
        this.f14137OooO0O0 = OooO0Oo();
        this.f14138OooO0OO = bool;
        this.f14139OooO0Oo = str;
    }
}
