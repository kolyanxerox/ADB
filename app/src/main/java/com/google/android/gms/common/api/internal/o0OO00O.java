package com.google.android.gms.common.api.internal;

import OoooO0O.o0000O00;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class o0OO00O extends Fragment implements OooOO0O {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final WeakHashMap f16740OooOo0o = new WeakHashMap();

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0000O00 f16741OooOo0O = new o0000O00();

    @Override // com.google.android.gms.common.api.internal.OooOO0O
    public final void OooO00o(String str, OooOO0 oooOO0) {
        this.f16741OooOo0O.OooO(str, oooOO0);
    }

    @Override // com.google.android.gms.common.api.internal.OooOO0O
    public final OooOO0 OooO0O0(Class cls, String str) {
        return (OooOO0) cls.cast(((Map) this.f16741OooOo0O.f13929OooO0OO).get(str));
    }

    @Override // com.google.android.gms.common.api.internal.OooOO0O
    public final Activity OooO0OO() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f16741OooOo0O.f13929OooO0OO).values().iterator();
        while (it.hasNext()) {
            ((OooOO0) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((Map) this.f16741OooOo0O.f13929OooO0OO).values().iterator();
        while (it.hasNext()) {
            ((OooOO0) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16741OooOo0O.OooOO0(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        o0000O00 o0000o00 = this.f16741OooOo0O;
        o0000o00.f13928OooO0O0 = 5;
        Iterator it = ((Map) o0000o00.f13929OooO0OO).values().iterator();
        while (it.hasNext()) {
            ((OooOO0) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        o0000O00 o0000o00 = this.f16741OooOo0O;
        o0000o00.f13928OooO0O0 = 3;
        Iterator it = ((Map) o0000o00.f13929OooO0OO).values().iterator();
        while (it.hasNext()) {
            ((OooOO0) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f16741OooOo0O.OooOO0O(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        o0000O00 o0000o00 = this.f16741OooOo0O;
        o0000o00.f13928OooO0O0 = 2;
        Iterator it = ((Map) o0000o00.f13929OooO0OO).values().iterator();
        while (it.hasNext()) {
            ((OooOO0) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        o0000O00 o0000o00 = this.f16741OooOo0O;
        o0000o00.f13928OooO0O0 = 4;
        Iterator it = ((Map) o0000o00.f13929OooO0OO).values().iterator();
        while (it.hasNext()) {
            ((OooOO0) it.next()).onStop();
        }
    }
}
