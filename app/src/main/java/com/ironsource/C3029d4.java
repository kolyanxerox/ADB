package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: com.ironsource.d4 */
/* loaded from: classes2.dex */
public class C3029d4 {

    /* renamed from: c */
    private String f7878c;

    /* renamed from: d */
    private String f7879d;

    /* renamed from: f */
    private int f7881f;

    /* renamed from: b */
    private HashSet<String> f7877b = new HashSet<>();

    /* renamed from: a */
    private boolean f7876a = false;

    /* renamed from: e */
    private boolean f7880e = false;

    /* renamed from: g */
    private boolean f7882g = true;

    /* renamed from: a */
    public int m8264a() {
        return this.f7881f;
    }

    /* renamed from: b */
    public HashSet<String> m8268b() {
        return this.f7877b;
    }

    /* renamed from: c */
    public String m8271c() {
        return this.f7879d;
    }

    /* renamed from: d */
    public String m8274d() {
        return this.f7878c;
    }

    /* renamed from: e */
    public boolean m8275e() {
        return this.f7880e;
    }

    /* renamed from: f */
    public boolean m8276f() {
        return this.f7876a;
    }

    /* renamed from: g */
    public boolean m8277g() {
        return this.f7882g;
    }

    /* renamed from: a */
    public void m8265a(int i) {
        this.f7881f = i;
    }

    /* renamed from: b */
    public void m8269b(String str) {
        this.f7879d = str;
    }

    /* renamed from: c */
    public void m8272c(String str) {
        this.f7878c = str;
    }

    /* renamed from: a */
    public void m8266a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7877b.add(str);
    }

    /* renamed from: b */
    public void m8270b(boolean z) {
        this.f7882g = z;
    }

    /* renamed from: c */
    public void m8273c(boolean z) {
        this.f7880e = z;
    }

    /* renamed from: a */
    public void m8267a(boolean z) {
        this.f7876a = z;
    }
}
