package org.apache.tika.parser;

import org.apache.tika.metadata.Metadata;

/* loaded from: classes3.dex */
public interface PasswordProvider {
    String getPassword(Metadata metadata);
}
