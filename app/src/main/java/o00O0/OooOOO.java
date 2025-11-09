package o00O0;

import com.google.android.gms.internal.measurement.o0OO00OO;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class OooOOO extends o0OO00OO {
    public static Object[] Oooo(Object[] objArr, int i, int i2) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        o0OO00OO.OooO0o(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        kotlin.jvm.internal.OooOo.OooO0Oo(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void Oooo0(int i, int i2, int[] iArr, int[] destination, int i3) {
        kotlin.jvm.internal.OooOo.OooO0o0(iArr, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(destination, "destination");
        System.arraycopy(iArr, i2, destination, i, i3 - i2);
    }

    public static List Oooo000(Object[] objArr) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.OooOo.OooO0Oo(listAsList, "asList(...)");
        return listAsList;
    }

    public static boolean Oooo00O(Object[] objArr, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        return OoooOOO(objArr, obj) >= 0;
    }

    public static void Oooo00o(int i, int i2, int i3, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(destination, "destination");
        System.arraycopy(objArr, i2, destination, i, i3 - i2);
    }

    public static void Oooo0O0(byte[] bArr, int i, byte[] destination, int i2, int i3) {
        kotlin.jvm.internal.OooOo.OooO0o0(bArr, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(destination, "destination");
        System.arraycopy(bArr, i2, destination, i, i3 - i2);
    }

    public static void Oooo0OO(float[] fArr, int i, float[] destination, int i2, int i3) {
        kotlin.jvm.internal.OooOo.OooO0o0(fArr, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(destination, "destination");
        System.arraycopy(fArr, i2, destination, i, i3 - i2);
    }

    public static /* synthetic */ void Oooo0o(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        Oooo0(i, 0, iArr, iArr2, i2);
    }

    public static void Oooo0o0(long[] jArr, long[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.OooOo.OooO0o0(jArr, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(destination, "destination");
        System.arraycopy(jArr, i2, destination, i, i3 - i2);
    }

    public static /* synthetic */ void Oooo0oO(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        Oooo00o(i, i2, i3, objArr, objArr2);
    }

    public static byte[] Oooo0oo(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.OooOo.OooO0o0(bArr, "<this>");
        o0OO00OO.OooO0o(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        kotlin.jvm.internal.OooOo.OooO0Oo(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static ArrayList OoooO(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void OoooO0(long[] jArr) {
        int length = jArr.length;
        kotlin.jvm.internal.OooOo.OooO0o0(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static void OoooO00(Object[] objArr, o000O0O0.OooO0O0 oooO0O0, int i, int i2) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        Arrays.fill(objArr, i, i2, oooO0O0);
    }

    public static Object OoooOO0(Object[] objArr) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int OoooOOO(Object[] objArr, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List OoooOOo(Object[] objArr) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? OoooOo0(objArr) : o0OO0O0.OooOO0o(objArr[0]) : oo000o.f31251OooOo0O;
    }

    public static ArrayList OoooOo0(Object[] objArr) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        return new ArrayList(new OooOO0O(objArr, false));
    }

    public static Object o000oOoO(int i, Object[] objArr) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }
}
