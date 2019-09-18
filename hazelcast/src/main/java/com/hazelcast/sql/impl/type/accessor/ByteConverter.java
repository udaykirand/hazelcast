/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.sql.impl.type.accessor;

import com.hazelcast.sql.impl.type.GenericType;

import java.math.BigDecimal;

/**
 * Converter for {@link java.lang.Byte} type.
 */
public final class ByteConverter extends Converter {
    /** Singleton instance. */
    public static ByteConverter INSTANCE = new ByteConverter();

    @Override
    public Class getClazz() {
        return Byte.class;
    }

    @Override
    public GenericType getGenericType() {
        return GenericType.TINYINT;
    }

    @Override
    public boolean asBit(Object val) {
        return cast(val) != 0;
    }

    @Override
    public final byte asTinyInt(Object val) {
        return cast(val);
    }

    @Override
    public final short asSmallInt(Object val) {
        return cast(val);
    }

    @Override
    public final int asInt(Object val) {
        return cast(val);
    }

    @Override
    public final long asBigInt(Object val) {
        return cast(val);
    }

    @Override
    public final BigDecimal asDecimal(Object val) {
        return new BigDecimal(cast(val));
    }

    @Override
    public final float asReal(Object val) {
        return cast(val);
    }

    @Override
    public final double asDouble(Object val) {
        return cast(val);
    }

    @Override
    public final String asVarchar(Object val) {
        return Byte.toString(cast(val));
    }

    private byte cast(Object val) {
        return (byte)val;
    }

    private ByteConverter() {
        // No-op.
    }
}