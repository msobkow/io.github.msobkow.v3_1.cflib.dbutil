/*
 *	Mark's Code Fractal CFLib DbUtil 3.1 Database Utilities and Types
 *
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *
 *	This file is part of Mark's Code Fractal CFLib DbUtil.
 *
 *	Mark's Code Fractal CFLib DbUtil is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU Library General Public License,
 *	Version 3 or later.
 *
 *	Mark's Code Fractal CFLib DbUtil is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU Library General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	Mark's Code Fractal CFLib DbUtil is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU Library General Public License for more details.
 *
 *	You should have received a copy of the GNU Library General Public License
 *	along with Mark's Code Fractal CFLib DbUtil.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *
 *	If you wish to modify and use this code without publishing your changes in order to
 *	tie it to proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

//package server.markhome.mcf.v3_1.cflib.dbutil;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import server.markhome.mcf.v3_1.cflib.dbutil.CFLibDbKeyHash256;

@Converter(autoApply = true)
public class CFLibDbKeyHash256Converter implements AttributeConverter<CFLibDbKeyHash256, byte[]> {
    
    @Override
    public byte[] convertToDatabaseColumn(CFLibDbKeyHash256 attribute) {
        return attribute != null ? attribute.getBytes() : null;
    }

    @Override
    public CFLibDbKeyHash256 convertToEntityAttribute(byte[] dbData) {
        return dbData != null ? new CFLibDbKeyHash256(dbData) : null;
    }
}
