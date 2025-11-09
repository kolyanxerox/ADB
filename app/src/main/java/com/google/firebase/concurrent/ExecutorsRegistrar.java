package com.google.firebase.concurrent;

import OoooO0O.o0000O0O;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import o0000O.OooOo00;
import o0000oOo.o0O00O;
import o0000oOo.o0O00O0o;
import o0000oOo.o0O00OO;
import o0000oOo.o0OoO00O;
import o0000oo0.o000000O;
import o0000oo0.o00000OO;
import o0000oo0.o00Oo0;
import o0000oo0.o0ooOOo;
import o00OoO00.OooOOO0;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000000O f28139OooO00o = new o000000O(new o0ooOOo(2));

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000000O f28140OooO0O0 = new o000000O(new o0ooOOo(3));

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000000O f28141OooO0OO = new o000000O(new o0ooOOo(4));

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000000O f28142OooO0Oo = new o000000O(new o0ooOOo(5));

    public static StrictMode.ThreadPolicy OooO00o() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        o00000OO o00000oo2 = new o00000OO(o0OoO00O.class, ScheduledExecutorService.class);
        o00000OO[] o00000ooArr = {new o00000OO(o0OoO00O.class, ExecutorService.class), new o00000OO(o0OoO00O.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o00000oo2);
        for (o00000OO o00000oo3 : o00000ooArr) {
            OooOOO0.OooO0o0(o00000oo3, "Null interface");
        }
        Collections.addAll(hashSet, o00000ooArr);
        o00Oo0 o00oo0 = new o00Oo0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new OooOo00(11), hashSet3);
        o00000OO o00000oo4 = new o00000OO(o0O00O0o.class, ScheduledExecutorService.class);
        o00000OO[] o00000ooArr2 = {new o00000OO(o0O00O0o.class, ExecutorService.class), new o00000OO(o0O00O0o.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(o00000oo4);
        for (o00000OO o00000oo5 : o00000ooArr2) {
            OooOOO0.OooO0o0(o00000oo5, "Null interface");
        }
        Collections.addAll(hashSet4, o00000ooArr2);
        o00Oo0 o00oo02 = new o00Oo0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new OooOo00(12), hashSet6);
        o00000OO o00000oo6 = new o00000OO(o0O00O.class, ScheduledExecutorService.class);
        o00000OO[] o00000ooArr3 = {new o00000OO(o0O00O.class, ExecutorService.class), new o00000OO(o0O00O.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(o00000oo6);
        for (o00000OO o00000oo7 : o00000ooArr3) {
            OooOOO0.OooO0o0(o00000oo7, "Null interface");
        }
        Collections.addAll(hashSet7, o00000ooArr3);
        o00Oo0 o00oo03 = new o00Oo0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new OooOo00(13), hashSet9);
        o0000O0O o0000o0oOooO0O0 = o00Oo0.OooO0O0(new o00000OO(o0O00OO.class, Executor.class));
        o0000o0oOooO0O0.f13935OooO0o = new OooOo00(14);
        return Arrays.asList(o00oo0, o00oo02, o00oo03, o0000o0oOooO0O0.OooO0o0());
    }
}
