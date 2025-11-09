package o0000Ooo;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.google.android.gms.internal.measurement.o0OOO0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class o0O00o0 extends o0o0Oo implements Set {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f29552OooOo = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public transient o00Oo00 f29553OooOo0o;

    public static int OooOO0O(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return BasicMeasure.EXACTLY;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static o0O00o0 OooOO0o(int i, Object... objArr) {
        if (i == 0) {
            return o0O000O.f29546OooOooo;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new o0OoOoOo(obj);
        }
        int iOooOO0O = OooOO0O(i);
        Object[] objArr2 = new Object[iOooOO0O];
        int i2 = iOooOO0O - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
            int iHashCode = obj2.hashCode();
            int iOooOO0 = o0OOO0.OooOO0(iHashCode);
            while (true) {
                int i6 = iOooOO0 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iOooOO0++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o0OoOoOo(obj4);
        }
        if (OooOO0O(i4) < iOooOO0O / 2) {
            return OooOO0o(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new o0O000O(i3, i2, i4, objArr, objArr2);
    }

    public o00Oo00 OooOO0() {
        o00Oo00 o00oo00 = this.f29553OooOo0o;
        if (o00oo00 != null) {
            return o00oo00;
        }
        o00Oo00 o00oo00OooOOO0 = OooOOO0();
        this.f29553OooOo0o = o00oo00OooOOO0;
        return o00oo00OooOOO0;
    }

    public o00Oo00 OooOOO0() {
        Object[] array = toArray(o0o0Oo.f29556OooOo0O);
        o00OOOO0 o00oooo0 = o00Oo00.f29532OooOo0o;
        return o00Oo00.OooOO0(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof o0O00o0) && (this instanceof o0O000O)) {
            o0O00o0 o0o00o0 = (o0O00o0) obj;
            o0o00o0.getClass();
            if ((o0o00o0 instanceof o0O000O) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }
}
