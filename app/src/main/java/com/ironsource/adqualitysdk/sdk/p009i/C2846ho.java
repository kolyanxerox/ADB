package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.adqualitysdk.sdk.p009i.C2847hp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ho */
/* loaded from: classes2.dex */
public class C2846ho {

    /* renamed from: ﻐ */
    private a f6638;

    /* renamed from: ﻛ */
    private List<Field> f6639;

    /* renamed from: ｋ */
    private C2847hp f6640;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ho$2 */
    public class AnonymousClass2 extends a {

        /* renamed from: ﻛ */
        private /* synthetic */ String f6641;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C2846ho c2846ho, String str) {
            super(c2846ho);
            str = str;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2846ho.a
        /* renamed from: ｋ */
        public final boolean mo6893(Field field) {
            return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ho$a */
    public class a {

        /* renamed from: ﻐ */
        private int f6642;

        /* renamed from: ﾇ */
        private C2847hp f6643;

        private a() {
        }

        /* renamed from: ﻛ */
        public final void m6894(C2847hp c2847hp) {
            this.f6643 = c2847hp;
            this.f6642 = c2847hp.m6902();
        }

        /* renamed from: ｋ */
        public boolean mo6893(Field field) {
            if (this.f6643 == null || (field.getModifiers() & this.f6643.m6876()) != this.f6643.m6876() || (field.getModifiers() & this.f6643.m6878()) != 0 || this.f6643.m6903().contains(field.getType())) {
                return false;
            }
            if (this.f6643.m6901() ? field.getType().equals(this.f6643.m6900()) : this.f6643.m6900().isAssignableFrom(field.getType())) {
                int i = this.f6642;
                if (i == 0) {
                    return true;
                }
                this.f6642 = i - 1;
            }
            return false;
        }

        /* renamed from: ﾇ */
        public final C2847hp m6895() {
            return this.f6643;
        }

        public /* synthetic */ a(C2846ho c2846ho) {
            this();
        }
    }

    /* renamed from: ﾒ */
    public static Field[] m6888(Class cls, boolean z, int i, List<String> list) throws SecurityException {
        while (cls != null && !C2911jz.m7392(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrM7409 = new Field[0];
        if (cls != null) {
            Field[] declaredFields = new Field[0];
            Field[] fields = new Field[0];
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fields = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArrM7409 = C2911jz.m7409(declaredFields, fields);
            if (!z) {
                return fieldArrM7409;
            }
            Class superclass = cls.getSuperclass();
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                try {
                    fieldArrM7409 = C2911jz.m7409(fieldArrM7409, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrM7409 = C2911jz.m7409(fieldArrM7409, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrM7409;
    }

    /* renamed from: ﻐ */
    public final <T> Field m6889(Class cls, Class<T> cls2) {
        Field fieldM6890;
        synchronized (C2906ju.class) {
            try {
                if (this.f6640 == null) {
                    this.f6640 = new C2847hp();
                }
                this.f6640.m6904(cls2);
                fieldM6890 = m6890(cls, this.f6640);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fieldM6890;
    }

    /* renamed from: ｋ */
    public final Field m6890(Class cls, C2847hp c2847hp) {
        synchronized (C2906ju.class) {
            try {
                if (this.f6639 == null) {
                    this.f6639 = new ArrayList();
                }
                this.f6639.clear();
                m6887(cls, c2847hp, this.f6639);
                if (this.f6639.isEmpty()) {
                    return null;
                }
                return this.f6639.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾇ */
    public final Field m6891(Class cls, String str) {
        AnonymousClass2 anonymousClass2 = new a(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ho.2

            /* renamed from: ﻛ */
            private /* synthetic */ String f6641;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C2846ho this, String str2) {
                super(this);
                str = str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2846ho.a
            /* renamed from: ｋ */
            public final boolean mo6893(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (C2846ho.class) {
            try {
                if (this.f6639 == null) {
                    this.f6639 = new ArrayList();
                }
                this.f6639.clear();
                m6884(cls, anonymousClass2, this.f6639);
                if (this.f6639.isEmpty()) {
                    return null;
                }
                return this.f6639.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﻐ */
    private void m6884(Class cls, a aVar, List<Field> list) throws SecurityException {
        for (Field field : m6885(cls, aVar.m6895())) {
            if (aVar.mo6893(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* renamed from: ｋ */
    private void m6887(Class cls, C2847hp c2847hp, List<Field> list) {
        synchronized (C2846ho.class) {
            try {
                if (this.f6638 == null) {
                    this.f6638 = new a(this);
                }
                this.f6638.m6894(c2847hp);
                m6884(cls, this.f6638, list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾇ */
    public final List<Field> m6892(Class cls, C2847hp c2847hp) {
        ArrayList arrayList = new ArrayList();
        m6887(cls, c2847hp, arrayList);
        return arrayList;
    }

    /* renamed from: ﻐ */
    private static Field[] m6885(Class cls, C2847hp c2847hp) {
        if (c2847hp != null && c2847hp.m6879()) {
            return m6888(cls, c2847hp.m6879(), c2847hp.m6877(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    /* renamed from: ｋ */
    public static C2847hp.e m6886() {
        return new C2847hp.e();
    }
}
