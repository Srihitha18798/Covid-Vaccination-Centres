package com.sritadip.covidvaccinations

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CenterRVAdapter(private val centerList: List<CenterRvModel>) :
    RecyclerView.Adapter<CenterRVAdapter.CenterRVViewHolder>() {

    class CenterRVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val centerNameTV: TextView = itemView.findViewById(R.id.idTvCenterName)
        val centerAddressTV: TextView = itemView.findViewById(R.id.idTvCenterLocation)
        val centerTimings: TextView = itemView.findViewById(R.id.idTVCenterTimings)
        val vaccineNameTV: TextView = itemView.findViewById(R.id.idTvVaccineName)
        val centerAgeLimitTV: TextView = itemView.findViewById(R.id.idTVAgeLimit)
        val centerFeeTypeTV: TextView = itemView.findViewById(R.id.idTVVaccineFees)
        val availabilityTV: TextView = itemView.findViewById(R.id.idTVAvailability)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CenterRVViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.center_rv_item, parent, false)
        return CenterRVViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CenterRVViewHolder, position: Int) {
        val center = centerList[position]
        holder.centerNameTV.text = center.centerName
        holder.centerAddressTV.text = center.centerAddress
        holder.centerTimings.text =
            ("From : " + center.centerFromTime + " To : " + center.centerToTime)
        holder.vaccineNameTV.text = center.vaccineName
        holder.centerFeeTypeTV.text = center.fee_type
        holder.centerAgeLimitTV.text = ("Age Limit : " + center.age_limit.toString())
        holder.availabilityTV.text = ("Availability : " + center.availableCapacity.toString())
    }

    override fun getItemCount(): Int {
        return centerList.size
    }
}