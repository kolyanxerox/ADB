package oooo00o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class o000O0 {

    /* renamed from: OooO00o */
    public static final o000O0 f33293OooO00o = new o000O0();

    /* renamed from: OooO0O0 */
    public static final Map f33294OooO0O0 = Collections.synchronizedMap(new LinkedHashMap());

    public static o000O00 OooO00o(o000O0Oo o000o0oo2) {
        Map dependencies = f33294OooO0O0;
        OooOo.OooO0Oo(dependencies, "dependencies");
        Object obj = dependencies.get(o000o0oo2);
        if (obj != null) {
            return (o000O00) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + o000o0oo2 + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:55:0x0099, B:58:0x00b0, B:59:0x00c8), top: B:64:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0097 -> B:54:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0O0(o00O0OO0.OooO0OO r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof oooo00o.o000O00O
            if (r0 == 0) goto L13
            r0 = r11
            oooo00o.o000O00O r0 = (oooo00o.o000O00O) r0
            int r1 = r0.f33305OooOooO
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33305OooOooO = r1
            goto L18
        L13:
            oooo00o.o000O00O r0 = new oooo00o.o000O00O
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f33304OooOoo0
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f33305OooOooO
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f33302OooOoOO
            java.util.Map r4 = r0.f33300OooOoO
            java.util.Map r4 = (java.util.Map) r4
            o00OO0O0.OooO00o r5 = r0.f33301OooOoO0
            oooo00o.o000O0Oo r6 = r0.f33297OooOo
            java.util.Iterator r7 = r0.f33299OooOo0o
            java.util.Map r8 = r0.f33298OooOo0O
            java.util.Map r8 = (java.util.Map) r8
            o00O0.o000OOo.OooOO0O(r11)
            goto L98
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            o00O0.o000OOo.OooOO0O(r11)
            java.util.Map r11 = oooo00o.o000O0.f33294OooO0O0
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.OooOo.OooO0Oo(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = o00O0.o0O0O00.OooOOOO(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L60:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Ld0
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            oooo00o.o000O0Oo r6 = (oooo00o.o000O0Oo) r6
            java.lang.Object r11 = r11.getValue()
            oooo00o.o000O00 r11 = (oooo00o.o000O00) r11
            o00OO0O0.OooO0o r5 = r11.f33295OooO00o
            r11 = r4
            java.util.Map r11 = (java.util.Map) r11
            r0.f33298OooOo0O = r11
            r0.f33299OooOo0o = r7
            r0.f33297OooOo = r6
            r0.f33301OooOoO0 = r5
            r0.f33300OooOoO = r11
            r0.f33302OooOoOO = r2
            r0.f33305OooOooO = r3
            java.lang.Object r11 = r5.OooO0Oo(r0)
            if (r11 != r1) goto L97
            return r1
        L97:
            r8 = r4
        L98:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            kotlin.jvm.internal.OooOo.OooO0o0(r6, r9)     // Catch: java.lang.Throwable -> Lc9
            oooo00o.o000O00 r9 = OooO00o(r6)     // Catch: java.lang.Throwable -> Lc9
            o000Ooo.o00Ooo r9 = r9.f33296OooO0O0     // Catch: java.lang.Throwable -> Lc9
            if (r9 == 0) goto Lb0
            o00OO0O0.OooO0o r5 = (o00OO0O0.OooO0o) r5
            r5.OooO0o(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L60
        Lb0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc9
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r0 = move-exception
            o00OO0O0.OooO0o r5 = (o00OO0O0.OooO0o) r5
            r5.OooO0o(r11)
            throw r0
        Ld0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oooo00o.o000O0.OooO0O0(o00O0OO0.OooO0OO):java.lang.Object");
    }
}
