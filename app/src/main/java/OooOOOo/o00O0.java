package OoooOOO;

import Oooo00O.o000000O;
import androidx.collection.ArrayMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f14102OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14103OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f14104OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f14105OooOoO0;

    public o00O0(o0oOOo o0oooo, String str, long j, int i) {
        this.f14103OooOo0O = i;
        switch (i) {
            case 1:
                this.f14104OooOo0o = str;
                this.f14102OooOo = j;
                Objects.requireNonNull(o0oooo);
                this.f14105OooOoO0 = o0oooo;
                break;
            default:
                this.f14104OooOo0o = str;
                this.f14102OooOo = j;
                Objects.requireNonNull(o0oooo);
                this.f14105OooOoO0 = o0oooo;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14103OooOo0O) {
            case 0:
                o0oOOo o0oooo = this.f14105OooOoO0;
                o0oooo.OooOO0O();
                String str = this.f14104OooOo0o;
                o000000O.OooO0o0(str);
                ArrayMap arrayMap = o0oooo.f14589OooOo;
                boolean zIsEmpty = arrayMap.isEmpty();
                long j = this.f14102OooOo;
                if (zIsEmpty) {
                    o0oooo.f14591OooOoO0 = j;
                }
                Integer num = (Integer) arrayMap.get(str);
                if (num == null) {
                    if (arrayMap.size() < 100) {
                        arrayMap.put(str, 1);
                        o0oooo.f14590OooOo0o.put(str, Long.valueOf(j));
                        break;
                    } else {
                        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) o0oooo.f14574OooOo0O).f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o0);
                        o0o0o0o0.f14396OooOooO.OooO0O0("Too many ads visible");
                        break;
                    }
                } else {
                    arrayMap.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                o0oOOo o0oooo2 = this.f14105OooOoO0;
                o0oooo2.OooOO0O();
                String str2 = this.f14104OooOo0o;
                o000000O.OooO0o0(str2);
                ArrayMap arrayMap2 = o0oooo2.f14589OooOo;
                Integer num2 = (Integer) arrayMap2.get(str2);
                o0OO0oO0 o0oo0oo0 = (o0OO0oO0) o0oooo2.f14574OooOo0O;
                if (num2 == null) {
                    o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14393OooOoOO.OooO0OO(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    oO00o000 oo00o000 = o0oo0oo0.f14528Oooo00O;
                    o0OO0oO0.OooOO0o(oo00o000);
                    oO00OOo0 oo00ooo0OooOOo0 = oo00o000.OooOOo0(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        arrayMap2.put(str2, Integer.valueOf(iIntValue));
                        break;
                    } else {
                        arrayMap2.remove(str2);
                        ArrayMap arrayMap3 = o0oooo2.f14590OooOo0o;
                        Long l = (Long) arrayMap3.get(str2);
                        long j2 = this.f14102OooOo;
                        o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
                        if (l == null) {
                            o0OO0oO0.OooOOO0(o0o0o0o03);
                            o0o0o0o03.f14393OooOoOO.OooO0O0("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j2 - l.longValue();
                            arrayMap3.remove(str2);
                            o0oooo2.OooOOOo(str2, jLongValue, oo00ooo0OooOOo0);
                        }
                        if (arrayMap2.isEmpty()) {
                            long j3 = o0oooo2.f14591OooOoO0;
                            if (j3 != 0) {
                                o0oooo2.OooOOOO(j2 - j3, oo00ooo0OooOOo0);
                                o0oooo2.f14591OooOoO0 = 0L;
                                break;
                            } else {
                                o0OO0oO0.OooOOO0(o0o0o0o03);
                                o0o0o0o03.f14393OooOoOO.OooO0O0("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
