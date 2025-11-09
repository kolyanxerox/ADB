package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class ooOOO00O {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final ooOOO00O f26913OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ ooOOO00O[] f26914OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final ooOOO00O f26915OooOoO0;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ooo0o f26916OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f26917OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    ooOOO00O EF1;

    /* JADX INFO: Fake field, exist only in values array */
    ooOOO00O EF2;

    /* JADX INFO: Fake field, exist only in values array */
    ooOOO00O EF0;

    static {
        ooOOO00O ooooo00o = new ooOOO00O("DOUBLE", 0, ooo0o.f26930OooOoO0, 1);
        ooOOO00O ooooo00o2 = new ooOOO00O("FLOAT", 1, ooo0o.f26926OooOo, 5);
        ooo0o ooo0oVar = ooo0o.f26928OooOo0o;
        ooOOO00O ooooo00o3 = new ooOOO00O("INT64", 2, ooo0oVar, 0);
        ooOOO00O ooooo00o4 = new ooOOO00O("UINT64", 3, ooo0oVar, 0);
        ooo0o ooo0oVar2 = ooo0o.f26927OooOo0O;
        ooOOO00O ooooo00o5 = new ooOOO00O("INT32", 4, ooo0oVar2, 0);
        ooOOO00O ooooo00o6 = new ooOOO00O("FIXED64", 5, ooo0oVar, 1);
        ooOOO00O ooooo00o7 = new ooOOO00O("FIXED32", 6, ooo0oVar2, 5);
        ooOOO00O ooooo00o8 = new ooOOO00O("BOOL", 7, ooo0o.f26929OooOoO, 0);
        ooOOO00O ooooo00o9 = new ooOOO00O("STRING", 8, ooo0o.f26931OooOoOO, 2);
        f26913OooOo = ooooo00o9;
        ooo0o ooo0oVar3 = ooo0o.f26934OooOooO;
        ooOOO00O ooooo00o10 = new ooOOO00O("GROUP", 9, ooo0oVar3, 3);
        f26915OooOoO0 = ooooo00o10;
        f26914OooOoO = new ooOOO00O[]{ooooo00o, ooooo00o2, ooooo00o3, ooooo00o4, ooooo00o5, ooooo00o6, ooooo00o7, ooooo00o8, ooooo00o9, ooooo00o10, new ooOOO00O("MESSAGE", 10, ooo0oVar3, 2), new ooOOO00O("BYTES", 11, ooo0o.f26933OooOoo0, 2), new ooOOO00O("UINT32", 12, ooo0oVar2, 0), new ooOOO00O("ENUM", 13, ooo0o.f26932OooOoo, 0), new ooOOO00O("SFIXED32", 14, ooo0oVar2, 5), new ooOOO00O("SFIXED64", 15, ooo0oVar, 1), new ooOOO00O("SINT32", 16, ooo0oVar2, 0), new ooOOO00O("SINT64", 17, ooo0oVar, 0)};
    }

    public ooOOO00O(String str, int i, ooo0o ooo0oVar, int i2) {
        this.f26916OooOo0O = ooo0oVar;
        this.f26917OooOo0o = i2;
    }

    public static ooOOO00O[] values() {
        return (ooOOO00O[]) f26914OooOoO.clone();
    }
}
