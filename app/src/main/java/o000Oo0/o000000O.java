package o000oo0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public final class o000000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f31032OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final List f31033OooO0O0;

    public o000000O(String str, List list) {
        this.f31032OooO00o = str;
        this.f31033OooO0O0 = list == null ? new ArrayList() : list;
    }

    public static Object OooO00o(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bArr[i] = (byte) ((Integer) list.get(i)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o000000O)) {
            return false;
        }
        o000000O o000000o2 = (o000000O) obj;
        String str = this.f31032OooO00o;
        if (str != null) {
            if (!str.equals(o000000o2.f31032OooO00o)) {
                return false;
            }
        } else if (o000000o2.f31032OooO00o != null) {
            return false;
        }
        List list = this.f31033OooO0O0;
        if (list.size() != o000000o2.f31033OooO0O0.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            boolean z = list.get(i) instanceof byte[];
            List list2 = o000000o2.f31033OooO0O0;
            if (z && (list2.get(i) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                    return false;
                }
            } else if (!list.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f31032OooO00o;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31032OooO00o);
        List list = this.f31033OooO0O0;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = StringUtils.SPACE + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
