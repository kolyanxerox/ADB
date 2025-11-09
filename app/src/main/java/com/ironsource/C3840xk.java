package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.xk */
/* loaded from: classes2.dex */
public class C3840xk {

    /* renamed from: c */
    private static C3840xk f12660c;

    /* renamed from: a */
    private final HashSet<ImpressionDataListener> f12661a = new HashSet<>();

    /* renamed from: b */
    private ConcurrentHashMap<String, List<String>> f12662b = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static synchronized C3840xk m13069b() {
        try {
            if (f12660c == null) {
                f12660c = new C3840xk();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12660c;
    }

    /* renamed from: a */
    public HashSet<ImpressionDataListener> m13070a() {
        return this.f12661a;
    }

    /* renamed from: c */
    public ConcurrentHashMap<String, List<String>> m13074c() {
        return this.f12662b;
    }

    /* renamed from: d */
    public void m13075d() {
        synchronized (this) {
            this.f12661a.clear();
        }
    }

    /* renamed from: a */
    public void m13071a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f12661a.add(impressionDataListener);
        }
    }

    /* renamed from: b */
    public void m13073b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f12661a.remove(impressionDataListener);
        }
    }

    /* renamed from: a */
    public void m13072a(String str, List<String> list) {
        this.f12662b.put(str, list);
    }
}
