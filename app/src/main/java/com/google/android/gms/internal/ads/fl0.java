package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.InterfaceC3771vj;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public final class fl0 extends rj0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f18962OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public AssetFileDescriptor f18963OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public long f18964OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public FileInputStream f18965OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f18966OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final Object f18967OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public Object f18968Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl0(Context context, int i) {
        super(false);
        this.f18962OooOoO = i;
        switch (i) {
            case 1:
                super(false);
                this.f18967OooOooo = context.getApplicationContext();
                break;
            default:
                this.f18967OooOooo = context.getContentResolver();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) throws Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException, IOException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        Resources resourcesForApplication;
        int identifier;
        Resources resources;
        long size;
        switch (this.f18962OooOoO) {
            case 0:
                try {
                    try {
                        Uri uriNormalizeScheme = iq0Var.f20087OooO00o.normalizeScheme();
                        this.f18968Oooo000 = uriNormalizeScheme;
                        OooO0oO(iq0Var);
                        boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                        ContentResolver contentResolver = (ContentResolver) this.f18967OooOooo;
                        if (zEquals) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                        } else {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                        }
                        this.f18963OooOoOO = assetFileDescriptorOpenAssetFileDescriptor;
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            IOException iOException = new IOException("Could not open file descriptor for: ".concat(String.valueOf(uriNormalizeScheme)));
                            i = IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL;
                            try {
                                throw new vk0(iOException, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
                            } catch (IOException e) {
                                e = e;
                                throw new vk0(e, true != (e instanceof FileNotFoundException) ? i : InterfaceC3771vj.a.f12372d);
                            }
                        }
                        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                        FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        this.f18965OooOoo0 = fileInputStream;
                        long j = iq0Var.f20089OooO0OO;
                        if (length != -1 && j > length) {
                            throw new vk0(null, 2008);
                        }
                        long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                        long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                        if (jSkip != j) {
                            throw new vk0(null, 2008);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size2 = channel.size();
                            if (size2 == 0) {
                                this.f18964OooOoo = -1L;
                                jPosition = -1;
                            } else {
                                jPosition = size2 - channel.position();
                                this.f18964OooOoo = jPosition;
                                if (jPosition < 0) {
                                    throw new vk0(null, 2008);
                                }
                            }
                        } else {
                            jPosition = length - jSkip;
                            this.f18964OooOoo = jPosition;
                            if (jPosition < 0) {
                                throw new vk0(null, 2008);
                            }
                        }
                        long j2 = iq0Var.f20090OooO0Oo;
                        if (j2 != -1) {
                            this.f18964OooOoo = jPosition == -1 ? j2 : Math.min(jPosition, j2);
                        }
                        this.f18966OooOooO = true;
                        OooO(iq0Var);
                        return j2 != -1 ? j2 : this.f18964OooOoo;
                    } catch (IOException e2) {
                        e = e2;
                        i = IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL;
                    }
                } catch (vk0 e3) {
                    throw e3;
                }
                break;
            default:
                this.f18968Oooo000 = iq0Var;
                OooO0oO(iq0Var);
                Uri uriNormalizeScheme2 = iq0Var.f20087OooO00o.normalizeScheme();
                boolean zEquals2 = TextUtils.equals("rawresource", uriNormalizeScheme2.getScheme());
                Context context = (Context) this.f18967OooOooo;
                if (zEquals2) {
                    resources = context.getResources();
                    List<String> pathSegments = uriNormalizeScheme2.getPathSegments();
                    if (pathSegments.size() != 1) {
                        throw new wy0(IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, OooO0oO.OooOo.OooO0o(pathSegments.size(), "rawresource:// URI must have exactly one path element, found "), null);
                    }
                    try {
                        identifier = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new wy0(1004, "Resource identifier must be an integer.", null);
                    }
                } else {
                    if (!TextUtils.equals("android.resource", uriNormalizeScheme2.getScheme())) {
                        throw new wy0(1004, OooO0oO.OooOo.OooOO0O("Unsupported URI scheme (", uriNormalizeScheme2.getScheme(), "). Only android.resource is supported."), null);
                    }
                    String path = uriNormalizeScheme2.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String packageName = TextUtils.isEmpty(uriNormalizeScheme2.getHost()) ? context.getPackageName() : uriNormalizeScheme2.getHost();
                    if (packageName.equals(context.getPackageName())) {
                        resourcesForApplication = context.getResources();
                    } else {
                        try {
                            resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                        } catch (PackageManager.NameNotFoundException e4) {
                            throw new wy0(InterfaceC3771vj.a.f12372d, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e4);
                        }
                    }
                    if (path.matches("\\d+")) {
                        try {
                            identifier = Integer.parseInt(path);
                        } catch (NumberFormatException unused2) {
                            throw new wy0(1004, "Resource identifier must be an integer.", null);
                        }
                    } else {
                        identifier = resourcesForApplication.getIdentifier(OooO0oO.OooOo.OooOoo(packageName, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, path), "raw", null);
                        if (identifier == 0) {
                            throw new wy0(InterfaceC3771vj.a.f12372d, "Resource not found.", null);
                        }
                    }
                    resources = resourcesForApplication;
                }
                try {
                    AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
                    if (assetFileDescriptorOpenRawResourceFd == null) {
                        throw new wy0(IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, "Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme2)), null);
                    }
                    this.f18963OooOoOO = assetFileDescriptorOpenRawResourceFd;
                    long length2 = assetFileDescriptorOpenRawResourceFd.getLength();
                    FileInputStream fileInputStream2 = new FileInputStream(this.f18963OooOoOO.getFileDescriptor());
                    this.f18965OooOoo0 = fileInputStream2;
                    long j3 = iq0Var.f20089OooO0OO;
                    try {
                        if (length2 != -1 && j3 > length2) {
                            throw new wy0(2008, null, null);
                        }
                        long startOffset2 = this.f18963OooOoOO.getStartOffset();
                        long jSkip2 = fileInputStream2.skip(startOffset2 + j3) - startOffset2;
                        if (jSkip2 != j3) {
                            throw new wy0(2008, null, null);
                        }
                        if (length2 == -1) {
                            FileChannel channel2 = fileInputStream2.getChannel();
                            if (channel2.size() == 0) {
                                this.f18964OooOoo = -1L;
                                size = -1;
                            } else {
                                size = channel2.size() - channel2.position();
                                this.f18964OooOoo = size;
                                if (size < 0) {
                                    throw new wy0(2008, null, null);
                                }
                            }
                        } else {
                            size = length2 - jSkip2;
                            this.f18964OooOoo = size;
                            if (size < 0) {
                                throw new hn0();
                            }
                        }
                        long j4 = iq0Var.f20090OooO0Oo;
                        if (j4 != -1) {
                            this.f18964OooOoo = size == -1 ? j4 : Math.min(size, j4);
                        }
                        this.f18966OooOooO = true;
                        OooO(iq0Var);
                        return j4 != -1 ? j4 : this.f18964OooOoo;
                    } catch (wy0 e5) {
                        throw e5;
                    } catch (IOException e6) {
                        throw new wy0(IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, null, e6);
                    }
                } catch (Resources.NotFoundException e7) {
                    throw new wy0(InterfaceC3771vj.a.f12372d, null, e7);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f18962OooOoO) {
            case 0:
                if (i2 == 0) {
                    return 0;
                }
                long j = this.f18964OooOoo;
                if (j == 0) {
                    return -1;
                }
                if (j != -1) {
                    try {
                        i2 = (int) Math.min(j, i2);
                    } catch (IOException e) {
                        throw new vk0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
                    }
                }
                FileInputStream fileInputStream = this.f18965OooOoo0;
                int i3 = i80.f19994OooO00o;
                int i4 = fileInputStream.read(bArr, i, i2);
                if (i4 == -1) {
                    return -1;
                }
                long j2 = this.f18964OooOoo;
                if (j2 != -1) {
                    this.f18964OooOoo = j2 - i4;
                }
                OooO00o(i4);
                return i4;
            default:
                if (i2 == 0) {
                    return 0;
                }
                long j3 = this.f18964OooOoo;
                if (j3 == 0) {
                    return -1;
                }
                if (j3 != -1) {
                    try {
                        i2 = (int) Math.min(j3, i2);
                    } catch (IOException e2) {
                        throw new wy0(IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, null, e2);
                    }
                }
                FileInputStream fileInputStream2 = this.f18965OooOoo0;
                int i5 = i80.f19994OooO00o;
                int i6 = fileInputStream2.read(bArr, i, i2);
                if (i6 == -1) {
                    if (this.f18964OooOoo == -1) {
                        return -1;
                    }
                    throw new wy0(IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, "End of stream reached having not read sufficient data.", new EOFException());
                }
                long j4 = this.f18964OooOoo;
                if (j4 != -1) {
                    this.f18964OooOoo = j4 - i6;
                }
                OooO00o(i6);
                return i6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        switch (this.f18962OooOoO) {
            case 0:
                return (Uri) this.f18968Oooo000;
            default:
                iq0 iq0Var = (iq0) this.f18968Oooo000;
                if (iq0Var != null) {
                    return iq0Var.f20087OooO00o;
                }
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        switch (this.f18962OooOoO) {
            case 0:
                this.f18968Oooo000 = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = this.f18965OooOoo0;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            this.f18965OooOoo0 = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor = this.f18963OooOoOO;
                                if (assetFileDescriptor != null) {
                                    assetFileDescriptor.close();
                                }
                                this.f18963OooOoOO = null;
                                if (this.f18966OooOooO) {
                                    this.f18966OooOooO = false;
                                    OooO0OO();
                                    return;
                                }
                                return;
                            } catch (IOException e) {
                                throw new vk0(e, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
                            }
                        } catch (Throwable th) {
                            this.f18963OooOoOO = null;
                            if (this.f18966OooOooO) {
                                this.f18966OooOooO = false;
                                OooO0OO();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f18965OooOoo0 = null;
                        try {
                            AssetFileDescriptor assetFileDescriptor2 = this.f18963OooOoOO;
                            if (assetFileDescriptor2 != null) {
                                assetFileDescriptor2.close();
                            }
                            this.f18963OooOoOO = null;
                            if (this.f18966OooOooO) {
                                this.f18966OooOooO = false;
                                OooO0OO();
                            }
                            throw th2;
                        } catch (IOException e2) {
                            throw new vk0(e2, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
                        }
                    }
                } catch (IOException e3) {
                    throw new vk0(e3, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
                }
            default:
                this.f18968Oooo000 = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream2 = this.f18965OooOoo0;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            this.f18965OooOoo0 = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor3 = this.f18963OooOoOO;
                                if (assetFileDescriptor3 != null) {
                                    assetFileDescriptor3.close();
                                }
                                this.f18963OooOoOO = null;
                                if (this.f18966OooOooO) {
                                    this.f18966OooOooO = false;
                                    OooO0OO();
                                    return;
                                }
                                return;
                            } catch (IOException e4) {
                                throw new wy0(IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, null, e4);
                            }
                        } catch (Throwable th3) {
                            this.f18963OooOoOO = null;
                            if (this.f18966OooOooO) {
                                this.f18966OooOooO = false;
                                OooO0OO();
                            }
                            throw th3;
                        }
                    } catch (IOException e5) {
                        throw new wy0(IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, null, e5);
                    }
                } catch (Throwable th4) {
                    this.f18965OooOoo0 = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor4 = this.f18963OooOoOO;
                        if (assetFileDescriptor4 != null) {
                            assetFileDescriptor4.close();
                        }
                        this.f18963OooOoOO = null;
                        if (this.f18966OooOooO) {
                            this.f18966OooOooO = false;
                            OooO0OO();
                        }
                        throw th4;
                    } catch (IOException e6) {
                        throw new wy0(IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, null, e6);
                    }
                }
        }
    }
}
