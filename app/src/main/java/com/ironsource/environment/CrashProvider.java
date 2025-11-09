package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.C3180ha;

/* loaded from: classes2.dex */
public class CrashProvider extends ContentProvider {

    /* renamed from: a */
    Context f8428a;

    /* renamed from: b */
    C3180ha f8429b;

    /* renamed from: c */
    String f8430c;

    /* renamed from: e */
    Uri f8432e;

    /* renamed from: h */
    String f8435h;

    /* renamed from: i */
    String f8436i;

    /* renamed from: d */
    UriMatcher f8431d = new UriMatcher(-1);

    /* renamed from: f */
    final int f8433f = 1;

    /* renamed from: g */
    final int f8434g = 2;

    /* renamed from: j */
    final String f8437j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = this.f8431d.match(uri);
        if (iMatch == 1) {
            return this.f8435h;
        }
        if (iMatch == 2) {
            return this.f8436i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f8428a = getContext();
        this.f8429b = new C3180ha(this.f8428a);
        this.f8430c = this.f8428a.getPackageName();
        this.f8432e = Uri.parse("content://" + this.f8430c + "/REPORTS");
        this.f8435h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f8436i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = this.f8431d.match(uri);
        if (iMatch == 1) {
            return C3180ha.m9108c();
        }
        if (iMatch == 2) {
            return C3180ha.m9103a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
