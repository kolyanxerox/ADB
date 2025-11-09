package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* loaded from: classes2.dex */
public abstract class o00O0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Collector f27056OooO00o;

    static {
        final int i = 0;
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 1;
        f27056OooO00o = Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.Oooo000
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i) {
                    case 0:
                        return new o0OO00O();
                    case 1:
                        return new o00000O();
                    default:
                        return new o00000();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o0OoOo0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((o0OO00O) obj).OooO00o(obj2);
                        return;
                    case 1:
                        o00000O o00000o = (o00000O) obj;
                        o00000o.getClass();
                        obj2.getClass();
                        o00000o.OooO00o(obj2);
                        return;
                    default:
                        o00000 o00000Var = (o00000) obj;
                        o000OO o000oo2 = (o000OO) obj2;
                        o00000Var.getClass();
                        if (o000oo2.f27021OooOo0O.equals(o000oo2.f27022OooOo0o)) {
                            throw new IllegalArgumentException(o0O000Oo.OooO0o("range must not be empty, but was %s", o000oo2));
                        }
                        o00000Var.f26971OooO00o.add(o000oo2);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.Oooo0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        o00000 o00000Var = (o00000) obj;
                        o00000Var.getClass();
                        ArrayList arrayList = ((o00000) obj2).f26971OooO00o;
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj3 = arrayList.get(i5);
                            i5++;
                            o000OO o000oo2 = (o000OO) obj3;
                            if (o000oo2.f27021OooOo0O.equals(o000oo2.f27022OooOo0o)) {
                                throw new IllegalArgumentException(o0O000Oo.OooO0o("range must not be empty, but was %s", o000oo2));
                            }
                            o00000Var.f26971OooO00o.add(o000oo2);
                        }
                        return o00000Var;
                    case 1:
                        o0OO00O o0oo00o = (o0OO00O) obj;
                        o0OO00O o0oo00o2 = (o0OO00O) obj2;
                        Object[] objArr = o0oo00o2.f20905OooO0O0;
                        int i6 = o0oo00o2.f20906OooO0OO;
                        for (int i7 = 0; i7 < i6; i7++) {
                            o0oo00o.getClass();
                            if (objArr[i7] == null) {
                                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i7, "at index "));
                            }
                        }
                        o0oo00o.OooO0o0(i6);
                        System.arraycopy(objArr, 0, o0oo00o.f20905OooO0O0, o0oo00o.f20906OooO0OO, i6);
                        o0oo00o.f20906OooO0OO += i6;
                        return o0oo00o;
                    default:
                        o00000O o00000o = (o00000O) obj;
                        o00000O o00000o2 = (o00000O) obj2;
                        Object[] objArr2 = o00000o2.f20905OooO0O0;
                        int i8 = o00000o2.f20906OooO0OO;
                        for (int i9 = 0; i9 < i8; i9++) {
                            o00000o.getClass();
                            if (objArr2[i9] == null) {
                                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i9, "at index "));
                            }
                        }
                        o00000o.OooO0o0(i8);
                        System.arraycopy(objArr2, 0, o00000o.f20905OooO0O0, o00000o.f20906OooO0OO, i8);
                        o00000o.f20906OooO0OO += i8;
                        return o00000o;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.o000oOoO
            /* JADX WARN: Removed duplicated region for block: B:102:0x0136 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 436
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o000oOoO.apply(java.lang.Object):java.lang.Object");
            }
        }, new Collector.Characteristics[0]);
        final int i5 = 1;
        final int i6 = 1;
        final int i7 = 2;
        final int i8 = 2;
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.Oooo000
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i5) {
                    case 0:
                        return new o0OO00O();
                    case 1:
                        return new o00000O();
                    default:
                        return new o00000();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o0OoOo0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        ((o0OO00O) obj).OooO00o(obj2);
                        return;
                    case 1:
                        o00000O o00000o = (o00000O) obj;
                        o00000o.getClass();
                        obj2.getClass();
                        o00000o.OooO00o(obj2);
                        return;
                    default:
                        o00000 o00000Var = (o00000) obj;
                        o000OO o000oo2 = (o000OO) obj2;
                        o00000Var.getClass();
                        if (o000oo2.f27021OooOo0O.equals(o000oo2.f27022OooOo0o)) {
                            throw new IllegalArgumentException(o0O000Oo.OooO0o("range must not be empty, but was %s", o000oo2));
                        }
                        o00000Var.f26971OooO00o.add(o000oo2);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.Oooo0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        o00000 o00000Var = (o00000) obj;
                        o00000Var.getClass();
                        ArrayList arrayList = ((o00000) obj2).f26971OooO00o;
                        int size = arrayList.size();
                        int i52 = 0;
                        while (i52 < size) {
                            Object obj3 = arrayList.get(i52);
                            i52++;
                            o000OO o000oo2 = (o000OO) obj3;
                            if (o000oo2.f27021OooOo0O.equals(o000oo2.f27022OooOo0o)) {
                                throw new IllegalArgumentException(o0O000Oo.OooO0o("range must not be empty, but was %s", o000oo2));
                            }
                            o00000Var.f26971OooO00o.add(o000oo2);
                        }
                        return o00000Var;
                    case 1:
                        o0OO00O o0oo00o = (o0OO00O) obj;
                        o0OO00O o0oo00o2 = (o0OO00O) obj2;
                        Object[] objArr = o0oo00o2.f20905OooO0O0;
                        int i62 = o0oo00o2.f20906OooO0OO;
                        for (int i72 = 0; i72 < i62; i72++) {
                            o0oo00o.getClass();
                            if (objArr[i72] == null) {
                                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i72, "at index "));
                            }
                        }
                        o0oo00o.OooO0o0(i62);
                        System.arraycopy(objArr, 0, o0oo00o.f20905OooO0O0, o0oo00o.f20906OooO0OO, i62);
                        o0oo00o.f20906OooO0OO += i62;
                        return o0oo00o;
                    default:
                        o00000O o00000o = (o00000O) obj;
                        o00000O o00000o2 = (o00000O) obj2;
                        Object[] objArr2 = o00000o2.f20905OooO0O0;
                        int i82 = o00000o2.f20906OooO0OO;
                        for (int i9 = 0; i9 < i82; i9++) {
                            o00000o.getClass();
                            if (objArr2[i9] == null) {
                                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i9, "at index "));
                            }
                        }
                        o00000o.OooO0o0(i82);
                        System.arraycopy(objArr2, 0, o00000o.f20905OooO0O0, o00000o.f20906OooO0OO, i82);
                        o00000o.f20906OooO0OO += i82;
                        return o00000o;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.o000oOoO
            @Override // java.util.function.Function
            public final Object apply(Object v) {
                /*
                    Method dump skipped, instructions count: 436
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o000oOoO.apply(java.lang.Object):java.lang.Object");
            }
        }, new Collector.Characteristics[0]);
        final int i9 = 2;
        final int i10 = 2;
        final int i11 = 0;
        final int i12 = 0;
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.Oooo000
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i9) {
                    case 0:
                        return new o0OO00O();
                    case 1:
                        return new o00000O();
                    default:
                        return new o00000();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o0OoOo0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((o0OO00O) obj).OooO00o(obj2);
                        return;
                    case 1:
                        o00000O o00000o = (o00000O) obj;
                        o00000o.getClass();
                        obj2.getClass();
                        o00000o.OooO00o(obj2);
                        return;
                    default:
                        o00000 o00000Var = (o00000) obj;
                        o000OO o000oo2 = (o000OO) obj2;
                        o00000Var.getClass();
                        if (o000oo2.f27021OooOo0O.equals(o000oo2.f27022OooOo0o)) {
                            throw new IllegalArgumentException(o0O000Oo.OooO0o("range must not be empty, but was %s", o000oo2));
                        }
                        o00000Var.f26971OooO00o.add(o000oo2);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.Oooo0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        o00000 o00000Var = (o00000) obj;
                        o00000Var.getClass();
                        ArrayList arrayList = ((o00000) obj2).f26971OooO00o;
                        int size = arrayList.size();
                        int i52 = 0;
                        while (i52 < size) {
                            Object obj3 = arrayList.get(i52);
                            i52++;
                            o000OO o000oo2 = (o000OO) obj3;
                            if (o000oo2.f27021OooOo0O.equals(o000oo2.f27022OooOo0o)) {
                                throw new IllegalArgumentException(o0O000Oo.OooO0o("range must not be empty, but was %s", o000oo2));
                            }
                            o00000Var.f26971OooO00o.add(o000oo2);
                        }
                        return o00000Var;
                    case 1:
                        o0OO00O o0oo00o = (o0OO00O) obj;
                        o0OO00O o0oo00o2 = (o0OO00O) obj2;
                        Object[] objArr = o0oo00o2.f20905OooO0O0;
                        int i62 = o0oo00o2.f20906OooO0OO;
                        for (int i72 = 0; i72 < i62; i72++) {
                            o0oo00o.getClass();
                            if (objArr[i72] == null) {
                                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i72, "at index "));
                            }
                        }
                        o0oo00o.OooO0o0(i62);
                        System.arraycopy(objArr, 0, o0oo00o.f20905OooO0O0, o0oo00o.f20906OooO0OO, i62);
                        o0oo00o.f20906OooO0OO += i62;
                        return o0oo00o;
                    default:
                        o00000O o00000o = (o00000O) obj;
                        o00000O o00000o2 = (o00000O) obj2;
                        Object[] objArr2 = o00000o2.f20905OooO0O0;
                        int i82 = o00000o2.f20906OooO0OO;
                        for (int i92 = 0; i92 < i82; i92++) {
                            o00000o.getClass();
                            if (objArr2[i92] == null) {
                                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i92, "at index "));
                            }
                        }
                        o00000o.OooO0o0(i82);
                        System.arraycopy(objArr2, 0, o00000o.f20905OooO0O0, o00000o.f20906OooO0OO, i82);
                        o00000o.f20906OooO0OO += i82;
                        return o00000o;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.o000oOoO
            @Override // java.util.function.Function
            public final Object apply(Object v) {
                /*
                    Method dump skipped, instructions count: 436
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o000oOoO.apply(java.lang.Object):java.lang.Object");
            }
        }, new Collector.Characteristics[0]);
    }
}
