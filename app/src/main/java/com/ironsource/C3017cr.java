package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.ironsource.cr */
/* loaded from: classes2.dex */
public class C3017cr {

    /* renamed from: a */
    private final ArrayList<String> f7805a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<String> f7806b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<String> f7807c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<String> f7808d = new ArrayList<>();

    /* renamed from: a */
    public ArrayList<String> m8204a() {
        return this.f7807c;
    }

    /* renamed from: b */
    public ArrayList<String> m8206b() {
        return this.f7806b;
    }

    /* renamed from: c */
    public ArrayList<String> m8208c() {
        return this.f7808d;
    }

    /* renamed from: d */
    public ArrayList<String> m8210d() {
        return this.f7805a;
    }

    /* renamed from: a */
    public void m8205a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7807c.add(str);
    }

    /* renamed from: b */
    public void m8207b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7806b.add(str);
    }

    /* renamed from: c */
    public void m8209c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7808d.add(str);
    }

    /* renamed from: d */
    public void m8211d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7805a.add(str);
    }
}
