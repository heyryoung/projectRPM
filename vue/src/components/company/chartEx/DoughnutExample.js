import { Doughnut } from './BaseCharts'

export default {
  extends: Doughnut,
  mounted () {
    this.renderChart({
      labels: ['원종석', '권혜령', '강성조'],
      datasets: [
        {
          backgroundColor: [
            '#41B883',
            '#E46651',
            '#00D8FF',
            '#DD1B16'
          ],
          data: [40, 20, 80, 10]
        }
      ]
    }, {responsive: true, maintainAspectRatio: false})
  }
}